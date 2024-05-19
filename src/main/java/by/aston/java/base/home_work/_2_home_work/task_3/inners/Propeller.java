package by.aston.java.base.home_work._2_home_work.task_3.inners;

public class Propeller {
    String detailPropeller;

    public Propeller() {
        this.detailPropeller = "propeller";
    }

    public String getDetailPropeller() {
        return detailPropeller;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Propeller{");
        sb.append("detailPropeller='").append(detailPropeller).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
