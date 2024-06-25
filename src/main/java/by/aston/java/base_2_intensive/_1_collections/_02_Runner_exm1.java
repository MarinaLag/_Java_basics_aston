package by.aston.java.base_2_intensive._1_collections;

import java.util.ArrayList;

public class _02_Runner_exm1 {
    public static void main(String[] args) {
// массив
        String [] arr = new String[5];
        arr[0] = "IT";
        arr[3] = "Java";
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }

//коллекция
        System.out.println("=================");
        ArrayList<String> list = new ArrayList<>();
        list.add("Class");
        list.add("Aston");
        System.out.println(list);
        list.add(0,"java");
        list.get(1);
        list.set(1,"nnnnnnnn");
        list.remove(1);
        list.remove("Aston");
        list.isEmpty();
        list.toString();



    }
}
