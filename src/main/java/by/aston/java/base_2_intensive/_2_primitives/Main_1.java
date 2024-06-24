package by.aston.java.base_2_intensive._2_primitives;

import java.util.ArrayList;

public class Main_1 {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Tom"));
        cats.add(new Cat(null));
        cats.add(new Cat("Nik"));

        Cat cat1 = new Cat("Tom");
        Cat cat2 = new Cat(null);
        Cat cat3 = new Cat("Nic");
        cat1.test();
        cat2.test();
        cat3.test();



    }
}
