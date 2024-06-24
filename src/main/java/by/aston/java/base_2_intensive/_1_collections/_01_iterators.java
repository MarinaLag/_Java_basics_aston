package by.aston.java.base_2_intensive._1_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class _01_iterators {
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("German");
        list.add("France");
        list.add("Italy");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) { // есть следующий
            System.out.println(iterator.next()); // получит
        }
        System.out.println("=======================");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("German");
        list1.add("France");
        list1.add("Italy");
        ListIterator<String> listIterator = list1.listIterator();
        while (listIterator.hasNext()) { // есть следующий
            System.out.println(listIterator.next()); // получит
        }
        System.out.println("======================");
        // изменяем значение
        listIterator.set("Spain");
        while (listIterator.hasPrevious()) { // есть предыдущий
            System.out.println(listIterator.previous());
        }

        System.out.println("============================");
        listIterator.add("US");
        for (String item : list1) {
            System.out.println(item);
        }
        System.out.println("===================");
        list.addAll(list1);
        System.out.println("list " + list);

        System.out.println("==================");
        System.out.println("list1 " + list1);
        System.out.println("list " + list);
        list.removeAll(list1);
        System.out.println("итог " + list);
        System.out.println(list1);

        System.out.println("==================");
        // list1.remove(0);
        System.out.println(list1.remove(0));
        System.out.println(list1);

        ArrayList <String> list3 = new ArrayList<>(10);


    }
}
