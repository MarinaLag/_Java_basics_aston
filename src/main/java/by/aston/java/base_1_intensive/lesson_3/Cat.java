package by.aston.java.base_1_intensive.lesson_3;

public class Cat extends Animals{
   int number ;

    public Cat(String nikename, int age) {
        super(nikename, age);
    }

    public Cat(String nikename, int age, int number) {
        super(nikename, age);
        this.number = number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("nikename='").append(nikename).append('\'');
        sb.append(", age=").append(age);
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }

}
