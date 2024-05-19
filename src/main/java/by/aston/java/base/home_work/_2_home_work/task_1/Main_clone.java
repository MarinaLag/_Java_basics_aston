package by.aston.java.base.home_work._2_home_work.task_1;

public class Main_clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Fish fish = new Fish("Dany", 2);
        System.out.println("fish " + fish);

        Fish fish1 = fish.clone();
        System.out.println("fish1 " + fish1);
        System.out.println(fish.equals(fish1));
        System.out.println(fish == fish1);

        Fish fish2 = new Fish("Dany", 2);
        System.out.println("fish2 " + fish2);
        System.out.println(fish.equals(fish2));
        System.out.println(fish == (fish2));

        System.out.println(fish.hashCode());
        System.out.println(fish1.hashCode());


    }
}
