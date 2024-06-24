package by.aston.java._home_work.myArrayList;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
// добавление
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(8);
        myArrayList.add(9);
        myArrayList.add(10);
        myArrayList.print();
// добавление с расширением массива
        myArrayList.add(11);
        myArrayList.print();
// добавление по индексу
        myArrayList.add(1, 22);
        myArrayList.print();
// получение элемента по индексу
        //  System.out.println(myArrayList.get(-1));  // нет такого индекса
        //  System.out.println(myArrayList.get(25));  // нет такого индекса
        System.out.println(myArrayList.get(1));
// изменить значение элемента по индексу
        // myArrayList.set(25,99); // нет такого индекса
        myArrayList.set(1, 222);
        myArrayList.print();
// удалить по индексу
        myArrayList.remove(1);
        // myArrayList.remove(-1); // нет такого индекса
        myArrayList.print();
// удаление по значению элемента
        myArrayList.remove((Integer) 8);
        myArrayList.print();

    }
}
