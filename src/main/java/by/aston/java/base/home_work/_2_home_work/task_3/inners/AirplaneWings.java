package by.aston.java.base.home_work._2_home_work.task_3.inners;

public class AirplaneWings {
    String  detailAirplaneWings;

    public AirplaneWings() {
        this.detailAirplaneWings ="airplaneWings";
    }

    public String getDetailAirplaneWings() {
        return detailAirplaneWings;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AirplaneWings{");
        sb.append("detailAirplaneWings='").append(detailAirplaneWings).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
