package by.aston.java.base_2_intensive._1_collections;

import java.util.*;

public class _04_Runner_exm3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(1,5);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.get(1));

        System.out.println("===========================");
        NavigableSet<Integer> nav = new TreeSet<>();
        nav.add(-5);
        nav.add(-1);
        nav.add(3);
        nav.add(6);
        nav.add(8);
        nav.add(10);
        System.out.println(nav.subSet(3,8));
        nav.add(3);
        System.out.println(nav);

        System.out.println("========================");
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1) - Math.abs(o2);
            }
        };
        Set<Integer> set1 = new TreeSet<>(com);
        set1.addAll(nav);
        System.out.println(set1);



        PriorityQueue <Integer> priorityQueue = new PriorityQueue<>();

        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        WeakHashMap<Integer,Integer> map1 = new WeakHashMap<>();
    }
}
