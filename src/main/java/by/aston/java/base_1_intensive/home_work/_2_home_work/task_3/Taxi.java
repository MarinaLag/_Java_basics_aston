package by.aston.java.base_1_intensive.home_work._2_home_work.task_3;

import by.aston.java.base_1_intensive.home_work._2_home_work.task_3.inners.Wheels;

public class Taxi extends TypeOfTransport {
    Wheels wheels;

    public Taxi(String name) {
        super(name);
        this.wheels = new Wheels();
    }

    public String getWheels() {
        return wheels.getDetailWheels();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Taxi{");
        sb.append("name='").append(name).append('\'');
        sb.append(", wheels=").append(getWheels());
        sb.append('}');
        return sb.toString();
    }
}
