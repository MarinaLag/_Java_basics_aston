package by.aston.java.base_1_intensive.lesson_3;

public class Main {
    public static void main(String[] args) {
        Animals cat0 = new Cat("KAty",2,0);
        cat0.getInfo();
        System.out.println(cat0);

        Animals cat1 = new Animals("SSSS",1);
        cat1.getInfo();
        System.out.println(cat1);

        Cat cat =new Cat("Tom",2,1);
        cat.getInfo();
        System.out.println(cat);

    }
}
