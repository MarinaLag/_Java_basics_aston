package by.aston.java.base_1_intensive.home_work._4_home_work._task_1;


import java.util.HashMap;

public class ProgramHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        System.out.println(map);

        String value = map.get(3);
        System.out.println(value);

        map.put(1, "M");       // добавление по ключу
        System.out.println(map);

        map.remove(1); // удаление по ключу
        System.out.println(map);

        System.out.println(map);


    }
}
