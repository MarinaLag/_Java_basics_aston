package by.aston.java.base.lesson_3.clone;

public class Main1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat cat = new Cat("Tom",5, new Tail("red"));
        Cat cat1 = (Cat) cat.clone();
        System.out.println(cat);
        System.out.println(cat1);


        //cat1.setTail("MMMMMMMMMMMMM");
        System.out.println(cat);
        System.out.println(cat1);


        Integer x = 5;
        Long e = Long.valueOf("125");
        System.out.println(x);
       System.out.println(e);
        System.out.println(e.doubleValue());
        System.out.println(x.doubleValue());





    }
}
