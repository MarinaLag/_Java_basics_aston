package by.aston.java.base.lesson_3.object;

import java.util.Objects;

public class Programm {
    String name;
    int age;

    public Programm(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Programm{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programm programm = (Programm) o;
        return age == programm.age && Objects.equals(name, programm.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
