package by.aston.java.base_1_intensive.lesson_2._adstrakt;

public class Cat extends Pets_home {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void getVoice() {
        System.out.println("May");
    }

    @Override
    public void info() {
        System.out.println("Cat");
    }
}
