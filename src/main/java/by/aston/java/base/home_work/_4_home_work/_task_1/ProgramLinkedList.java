package by.aston.java.base.home_work._4_home_work._task_1;

import java.util.LinkedList;

public class ProgramLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");  // добавляет всегда в конец
        list.push("10"); //  добавляет в середину
        list.add(list.size() / 2, "20"); // в середину
        System.out.println(list);

        list.removeFirst();// удаление первого
        list.removeLast(); // удаление последнего
        System.out.println(list);
        list.remove(list.size() / 2);
        System.out.println(list);

        list.poll();// получает и удаляет первый
        System.out.println(list);


    }
}
