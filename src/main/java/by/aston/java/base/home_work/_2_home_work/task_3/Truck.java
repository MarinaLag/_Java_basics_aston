package by.aston.java.base.home_work._2_home_work.task_3;

import by.aston.java.base.home_work._2_home_work.task_3.inners.Wheels;
import by.aston.java.base.home_work._2_home_work.task_3.interfaces.Transportable;

public class Truck extends TypeOfTransport implements Transportable {
    Wheels wheels;

    public Truck(String name) {
        super(name);
        this.wheels = new Wheels();
    }

    public String getWheels() {
        return wheels.getDetailWheels();
    }

    @Override
    public void carry() {
        System.out.println("Грузоподъумность: 5 тонн");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Truck{");
        sb.append("name='").append(name).append('\'');
        sb.append(", wheels=").append(getWheels());
        sb.append('}');
        return sb.toString();
    }
}
