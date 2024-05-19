package by.aston.java.base.lesson_3.clone;

public class Tail {
    String color;

    public Tail(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tail{");
        sb.append("color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
