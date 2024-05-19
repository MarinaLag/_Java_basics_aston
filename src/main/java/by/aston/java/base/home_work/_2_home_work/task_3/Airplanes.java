package by.aston.java.base.home_work._2_home_work.task_3;

import by.aston.java.base.home_work._2_home_work.task_3.inners.AirplaneWings;
import by.aston.java.base.home_work._2_home_work.task_3.inners.Propeller;
import by.aston.java.base.home_work._2_home_work.task_3.inners.Wheels;
import by.aston.java.base.home_work._2_home_work.task_3.interfaces.Transportable;

public class Airplanes extends TypeOfTransport implements Transportable {
    Wheels wheels;
    Propeller propeller;
    AirplaneWings airplaneWings;

    public Airplanes(String name) {
        super(name);
        this.wheels = new Wheels();
        this.propeller = new Propeller();
        this.airplaneWings = new AirplaneWings();
    }

    public String getWheels() {
        return wheels.getDetailWheels();
    }

    public String getPropeller() {
        return propeller.getDetailPropeller();
    }

    public String getAirplaneWings() {
        return airplaneWings.getDetailAirplaneWings();
    }

    @Override
    public void carry() {
        System.out.println("Грузоподъумность: 20 тонн");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Airplanes{");
        sb.append("name='").append(name).append('\'');
        sb.append(", wheels=").append(getWheels());
        sb.append(", propeller=").append(getPropeller());
        sb.append(", airplaneWings=").append(getAirplaneWings());
        sb.append('}');
        return sb.toString();
    }


}
