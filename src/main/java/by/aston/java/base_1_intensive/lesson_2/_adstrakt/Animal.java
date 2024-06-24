package by.aston.java.base_1_intensive.lesson_2._adstrakt;

public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void info();

    public void message(){
        System.out.println("This is pet ");
    }
}
