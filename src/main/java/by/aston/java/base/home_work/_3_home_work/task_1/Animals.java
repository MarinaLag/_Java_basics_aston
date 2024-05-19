package by.aston.java.base.home_work._3_home_work.task_1;

import java.util.Objects;

public abstract class Animals {
    private String nickname;
    private int age;

    public Animals() {
    }

    public Animals(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void print();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if(getClass() !=o.getClass()) return false;
        Animals animals = (Animals) o;
        if(age != animals.age) return false;
        return nickname.equals(animals.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, age);
    }
}
