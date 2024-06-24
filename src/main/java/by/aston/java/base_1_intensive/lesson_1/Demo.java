package by.aston.java.base_1_intensive.lesson_1;


public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Cat cat1 = new Cat("Tom");
        var cat2 = new Cat("Tom");

        System.out.println(cat1 == cat2);

        if (cat1 != cat2){  // сравниваем ссылки
            System.out.println("Два кота");
        }else {
            System.out.println("Один кот");
        }

//        Dog dog = new Dog("Reks");
//        System.out.println(dog);

//        Car car = new Car(1);
//        System.out.println(car);


    }
}
