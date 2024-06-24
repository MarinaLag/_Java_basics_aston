package by.aston.java.base_1_intensive.home_work._3_home_work.task_1;

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

        System.out.println("==============");
        Bears bear1 = new Bears("Jek", 8, " This has spice", "write");
        System.out.println(bear1);
        bear1.print();


        System.out.println("----------------");
        System.out.println(fish.equals(whale));
        System.out.println(fish.equals(cat));

        System.out.println(bear.equals(bear1));
        System.out.println(bear==bear1);

        System.out.println("-------------------");
        System.out.println(bear.hashCode());
        System.out.println(bear1.hashCode());
        System.out.println(bear.hashCode()==bear1.hashCode());



    }


}
