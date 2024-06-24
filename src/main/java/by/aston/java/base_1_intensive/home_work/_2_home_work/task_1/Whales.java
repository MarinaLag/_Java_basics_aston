package by.aston.java.base_1_intensive.home_work._2_home_work.task_1;

import by.aston.java.base_1_intensive.home_work._2_home_work.task_1.interfaces.LivesInWaterAble;

public class Whales extends Mammals implements LivesInWaterAble {

    public Whales(String nickname, int age, String spiceAnimal) {
        super(nickname, age, spiceAnimal);
    }

    @Override
    public void print() {
        System.out.println("This is a whale");
    }

    @Override
    public void live() {
        System.out.println("whale lives in water");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Whales{");
        sb.append("nickname='").append(getNickname()).append('\'');
        sb.append(", age='").append(getAge()).append('\'');
        sb.append(", spice=").append(getSpice());
        sb.append('}');
        return sb.toString();
    }
}
