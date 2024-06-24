package by.aston.java._home_work.myArrayList;

public class MyArrayList<E>{
    private E[] array;
    private int size;
    private int capacity;

    public MyArrayList() {
        this.size = 0;
        this.capacity = 10;
        this.array = (E[]) new Object[capacity];
    }

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity <= 0");
        } else {
            array = (E[]) new Object[capacity];
        }
    }

    public void add(E element) {
        if (size == capacity) {
            grow();
            array[size] = element; // добавляем элемет  в следующий
            size++;
        } else {
            array[size++] = element;
        }
    }

    public void add(int index, E element) {
        checkIndex(index, size);
        if (size == capacity) {
            grow();
        }
        for (int i = size; i >= index; i--) {// сдвигает вправо элементы от sizе
            array[i + 1] = array[i];
        }
        array[index] = element;  // записывает значение
        size++;
    }

    public boolean grow() {
        try { //нисходящее преобразование
            E[] temp = array;// во временную переменную записываем значения фактического массива
            array = (E[]) new Object[array.length + 5];  // создаем новый массив увеличив его размер
            capacity = capacity + 5; // увеличит capacity
            // или for
            System.arraycopy(temp, 0, array, 0, temp.length);// сколько копировать - temp.length - все элемен
            return true;
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
        return false;
    }

    public E get(int index) {
        checkIndex(index, size);
        return array[index];
    }

    public void set(int index, E element) {
        checkIndex(index, size);
        array[index] = element;
    }

    public boolean checkIndex(int index, int size) {
        // проверка индекса 0 = index < size
        if (index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        return true;
    }

    public E remove(int index) {
        checkIndex(index, size);
        for (int i = index; i < size; i++) { // смещаем все  влево
            array[i] = array[i + 1];
        }
        size--;
        return (E) array;
    }

    public void remove(E element) {
        // проверка наличия совпадения элемента
        int index = checkValue(element); // получит индекс
        if (index < 0) {
            return;
        } else {
            remove(index);
        }
    }

    public int checkValue(E element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(array[i])) {
                return i; // значение индекса
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void print() {
//        for (int i=0; i < array.length; i++){ // size
//            System.out.println(array[i]);
//        }
        for (E element : array) {
            System.out.print(element + ", ");
        }
        System.out.println("size = " + size + " capacity = " + capacity);
    }

}
