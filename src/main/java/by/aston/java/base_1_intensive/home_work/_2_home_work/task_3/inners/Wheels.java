package by.aston.java.base_1_intensive.home_work._2_home_work.task_3.inners;

public class Wheels {
    String detailWheels;

    public Wheels() {
        this.detailWheels = "wheels";
    }

    public String getDetailWheels() {
        return detailWheels;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Wheels{");
        sb.append("detailWheels='").append(detailWheels).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
