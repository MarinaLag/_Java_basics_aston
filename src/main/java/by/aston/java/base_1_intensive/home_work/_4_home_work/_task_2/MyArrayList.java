package by.aston.java.base_1_intensive.home_work._4_home_work._task_2;

import java.util.Arrays;

public class MyArrayList<E extends Object> {

    private int capacity;
    private int size;
    private E[] array;

    public MyArrayList() {
        this.capacity = 10;
        this.size = 0;
        this.array = (E[]) new Object[capacity];
    }

    public void add(E element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = element;
                //size++; создавать метод copy
                break;
            }
        }
    }

    public E get(int index) {
        return array[index];
    }

    public E remove(int index) {
        if (index < array.length) { // проверка на отрицальный
            for (int i = index; i < array.length; i++) {
                array[i - 1] = array[i];
                array[i] = null;
            }
        }
        return (E) array;
    }

    public void sort() {
        E temp;
        for (int j = 0; j < size - 1; j++) {
            for (int i = 0; i < size - 1 - j; i++) {
//                if (array[i] > array[i + 1]) { // ????????????????????????????
//                    temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
//                }
            }
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyArrayList{");
        sb.append("capacity=").append(capacity);
        sb.append(", array=").append(Arrays.toString(array));
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        System.out.println(myList);

        System.out.println(myList.get(4));
        myList.add(6);
        System.out.println(myList);

        myList.remove(1);
        System.out.println(myList);
        myList.sort();
        System.out.println(myList);


    }

}
