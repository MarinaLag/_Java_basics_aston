package by.aston.java.base_1_intensive.home_work._2_home_work.task_1;

public class Program {
    public static void main(String[] args) throws CloneNotSupportedException {
        Fish fish = new Fish("Dany", 2);
        System.out.println(fish);
        fish.print();
        fish.live();

        System.out.println("==============");
        Whales whale = new Whales("Tom", 10, " This has spice");
        System.out.println(whale);
        whale.print();
        whale.live();

        System.out.println("==============");
        Cats cat = new Cats("Masha", 2, " This has spice", "red");
        System.out.println(cat);
        cat.print();

        System.out.println("==============");
        Bears bear = new Bears("Jek", 8, " This has spice", "write");
        System.out.println(bear);
        bear.print();


    }


}
