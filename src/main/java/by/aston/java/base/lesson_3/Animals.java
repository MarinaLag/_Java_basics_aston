package by.aston.java.base.lesson_3;

public  class Animals {
    String nikename;
    int age;

    public Animals(String nikename, int age) {
        this.nikename = nikename;
        this.age = age;
    }
    public void getInfo(){
        System.out.println("Animal");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animals{");
        sb.append("nikename='").append(nikename).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
