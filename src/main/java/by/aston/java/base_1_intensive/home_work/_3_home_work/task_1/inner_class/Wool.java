package by.aston.java.base_1_intensive.home_work._3_home_work.task_1.inner_class;

import java.util.Objects;

// Агригация
public class Wool {
    private String wool;

    public Wool() {
    }

    public Wool(String wool) {
        this.wool = wool;
    }

    public String getWool() {
        return wool;
    }

    public void setWool(String wool) {
        this.wool = wool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wool wool1 = (Wool) o;
        return Objects.equals(wool, wool1.wool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wool);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Wool{");
        sb.append("wool='").append(wool).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
