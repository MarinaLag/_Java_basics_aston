package by.aston.java.base_1_intensive.home_work._4_home_work._task_1;

import java.util.ArrayList;

public class ProgramArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);

        list.add(0, 3);
        System.out.println("добавление в начало " + list);
        list.add(4);
        System.out.println("добавление в конец " + list); //автоматически
        list.add(list.size() / 2, 10);
        System.out.println("добавление в середину " + list);

        list.remove(0);
        System.out.println("удаление по индексу " + list);
        Integer remove = list.get(2);
        list.remove(remove);
        System.out.println("удаление по индексу " + list);
        list.removeAll(list);
        System.out.println(list);


    }

}
