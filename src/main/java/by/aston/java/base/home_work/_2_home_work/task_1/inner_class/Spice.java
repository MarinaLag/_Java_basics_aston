package by.aston.java.base.home_work._2_home_work.task_1.inner_class;

import java.util.Objects;

//Композиция
public class Spice {
    private String spiceAnimal;

    public Spice() {
    }

    public Spice(String spiceAnimal) {
        this.spiceAnimal = spiceAnimal;
    }

    public String getSpiceAnimal() {
        return spiceAnimal;
    }

    public void setSpiceAnimal(String spiceAnimal) {
        this.spiceAnimal = spiceAnimal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spice spice = (Spice) o;
        return Objects.equals(spiceAnimal, spice.spiceAnimal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spiceAnimal);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Spice{");
        sb.append("spiceAnimal='").append(spiceAnimal).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
