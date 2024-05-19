package by.aston.java.base.home_work._2_home_work.task_1;

public class Cats extends Mammals {

    public Cats(String nickname, int age, String spiceAnimal, String wool) {
        super(nickname, age, spiceAnimal, wool);
    }

    @Override
    public void print() {
        System.out.println("This is a cat");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cats{");
        sb.append("nickname='").append(getNickname()).append('\'');
        sb.append(", age='").append(getAge()).append('\'');
        sb.append(", spice='").append(getSpice()).append('\'');
        sb.append(", colorWool='").append(getColorWool()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
