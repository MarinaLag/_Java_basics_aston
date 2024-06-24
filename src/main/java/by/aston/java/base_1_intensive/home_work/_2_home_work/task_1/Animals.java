package by.aston.java.base_1_intensive.home_work._2_home_work.task_1;

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


}
