package by.aston.java.base.lesson_2.inner;

public class Main {
    public static void main(String[] args) {
        Building.House home1 = new Building.House("City", "Sovetscay");

        Building.House home2 = new Building.House("Mal", "Pobeda");
        home1.info();

        Building building = new Building("Nany", "Macsima");
        //  Building.House home3 = building.new House("mmmm", "kkkkkk");

        System.out.println("------------------------------");
        Cat cat1 = new Cat("Tom", "green");
        System.out.println(cat1);

        System.out.println("=============================");

//        Cat.CatTail tail = new Cat("Nice").new CatTail("cccccccccccccc");
//        System.out.println(tail);
//
//        Cat cat0 = new Cat("Mamy");
//        Cat.CatTail tail0 = cat0.new CatTail("iiiiiiiiiii");
//        System.out.println(cat0);
//        System.out.println(tail0);



    }
}
