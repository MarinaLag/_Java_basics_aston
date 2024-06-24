package by.aston.java.base_1_intensive.home_work._3_home_work.task_1;

public class Bears extends Mammals {
    public Bears(String nickname, int age, String spiceAnimal, String wool) {
        super(nickname, age, spiceAnimal, wool);
    }

    @Override
    public void print() {
        System.out.println("This is bear");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bears{");
        sb.append("nickname='").append(getNickname()).append('\'');
        sb.append(", age='").append(getAge()).append('\'');
        sb.append(", spice='").append(getSpice()).append('\'');
        sb.append(", colorWool='").append(getColorWool()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
