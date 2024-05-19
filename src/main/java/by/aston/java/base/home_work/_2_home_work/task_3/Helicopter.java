package by.aston.java.base.home_work._2_home_work.task_3;

import by.aston.java.base.home_work._2_home_work.task_3.inners.Propeller;
import by.aston.java.base.home_work._2_home_work.task_3.inners.Wheels;
import by.aston.java.base.home_work._2_home_work.task_3.interfaces.Transportable;

public class Helicopter extends TypeOfTransport implements Transportable {
    Wheels wheels;
    Propeller propeller;

    public Helicopter(String name) {
        super(name);
        this.wheels = new Wheels();
        this.propeller = new Propeller();
    }

    public String getWheels() {
        return wheels.getDetailWheels();
    }

    public String getPropeller() {
        return propeller.getDetailPropeller();
    }

    @Override
    public void carry() {
        System.out.println("Грузоподъумность: 10 тонн");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Helicopter{");
        sb.append("name='").append(name).append('\'');
        sb.append(", wheels=").append(getWheels());
        sb.append(", propeller=").append(getPropeller());
        sb.append('}');
        return sb.toString();
    }
}
