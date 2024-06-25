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

    /**
     * Добавляет указанный элемент в конец списка
     * Увеличивает size++
     * @param: element - элемент, который будет добавлен в этот список
     */
    public void add(E element) {
        if (size == capacity) {
            grow();
            array[size] = element;
            size++;
        } else {
            array[size++] = element;
        }
    }

    /**
     * Вставляет указанный элемент в указанную позицию в этом списке
     * Смещает элемент, находящийся в данный момент в этой позиции
     * и все последующие элементы вправо, добавляет единицу к их индексам
     * Увеличивает size++
     * @param: index - индекс, в который должен быть вставлен указанный элемент
     * @param: element - элемент, который должен быть вставлен
     * Throws: IndexOutOfBoundsException - если индекс выходит
     * за пределы диапазона (index < 0 || index >= size)
     */
    public void add(int index, E element) {
        checkIndex(index, size);
        if (size == capacity) {
            grow();
        }
        for (int i = size; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        size++;
    }

    /**
     * Расширяет список
     * Во временный массив temp записывает значения фактического массива
     * Создает новый массив увеличив его размер и capacity на 5
     * Копирует все элементы из временного массива в новый
     * @return: true - если метод завершен успешно
     * Throws:  ClassCastException - если класс указанного элемента препятствует добавлению его в этот список
     */
    public boolean grow() {
        try { //нисходящее преобразование
            E[] temp = array;
            array = (E[]) new Object[array.length + 5];
            capacity = capacity + 5;
            // или for
            System.arraycopy(temp, 0, array, 0, temp.length);
            return true;
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
        return false;
    }

    /**
     * Возвращает элемент в указанной позиции в этом списке
     * @param: index - индекс элемента для возврата элемента в указанной позиции в этом списке
     * @return: элемент в указанной позиции в этом списке
     * Throws: IndexOutOfBoundsException - если индекс выходит
     * за пределы диапазона (index < 0 || index >= size)
     */
    public E get(int index) {
        checkIndex(index, size);
        return array[index];
    }

    /**
     * Заменяет элемент в указанной позициив этом списке указанным элементом
     * @param: index - индекс элемента для замены
     * @param: element - элемент, который будет сохранен в указанной позиции
     * Throws: IndexOutOfBoundsException - если индекс выходит
     * за пределы диапазона (index < 0 || index >= size)
     */
    public void set(int index, E element) {
        checkIndex(index, size);
        array[index] = element;
    }

    /**
     * Проверяет, находится ли индекс в пределах диапазона index < 0 || index >= size
     * @param: index - индекс
     * @param: size - верхняя граница диапазона
     * @return: true - если индекс находится в заданном диапазоне
     * Throws: ArrayIndexOutOfBoundsException - если индекс выодит за пределы массива
     * IndexOutOfBoundsException - если индекс выходит
     * за пределы диапазона (index < 0 || index >= size)
     */
    public boolean checkIndex(int index, int size) {
        if (index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        return true;
    }

    /**
     * Удаляет элемент в указанной позиции в этом списке
     * Смещает любые последующие элементы влево
     * Уменьшает size--
     * @param: index - индекс элемента,который нужно удалить
     * @return: список после удаления
     * Throws: IndexOutOfBoundsException - если индекс выходит
     * за пределы диапазона (index < 0 || index >= size)
     */
    public E remove(int index) {
        checkIndex(index, size);
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return (E) array;
    }

    /**
     * Удаляет первое вхождение указанного элемента из этого списка,
     * если он присутствует.
     * Если список не содержит элемента, он не измеяется
     * @param: element - элемент, который нужно удалить из этого списка,
     */
    public void remove(E element) {
        int index = checkValue(element);
        if (index < 0) {
            return;
        } else {
            remove(index);
        }
    }

    /**
     * Указывает, равен ли какой-либо другой объект этому
     * @param: element - ссылочный объект с которым сравнивается
     * @return: значение индекса, если такой объект найден
     * или -1, если такой объект не найден
     */
    public int checkValue(E element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return i; // значение индекса
            }
        }
        return -1;
    }

    /**
     * Возврвщает true, если этот список не содержит элементов
     * @return: true, если этот список не содержит элементов
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Возвращает строковое представление этой коллекции
     * Строковое представление состоит из списка элементов коллекции в том порядке,
     * в котором они записаны в коллекци. Соседние элементы разделяются
     * символами <<,>> (запятая и пробел).
     * Указывается size и capacity списка
     * ДЛЯ УДОБСТВА ИСПОЛЬЗОВАЛА FOREACH :)
     * В методе описан вариан без foreach
     */
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
