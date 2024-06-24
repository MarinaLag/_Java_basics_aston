package by.aston.java.base_1_intensive.home_work._2_home_work.task_1;

import by.aston.java.base_1_intensive.home_work._2_home_work.task_1.interfaces.LivesInWaterAble;

public class Fish extends Animals implements LivesInWaterAble, Cloneable {

    public Fish() {
    }

    public Fish(String nickname, int age) {
        super(nickname, age);
    }

    @Override
    public void print() {
        System.out.println("This is a fish");
    }

    @Override
    public void live() {
        System.out.println("Fish lives in water");
    }

    @Override
    protected Fish clone() throws CloneNotSupportedException {
        return (Fish) super.clone();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fish{");
        sb.append("nickname='").append(getNickname()).append('\'');
        sb.append(", age=").append(getAge());
        sb.append('}');
        return sb.toString();
    }
}
