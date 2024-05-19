package by.aston.java.base.home_work._2_home_work.task_3;

import by.aston.java.base.home_work._2_home_work.task_3.inners.Propeller;
import by.aston.java.base.home_work._2_home_work.task_3.interfaces.Transportable;

public class Tanker extends TypeOfTransport implements Transportable {
    Propeller propeller;

    public Tanker(String name) {
        super(name);
        this.propeller = new Propeller();
    }

    public String getPropeller() {
        return propeller.getDetailPropeller();
    }

    @Override
    public void carry() {
        System.out.println("Грузоподъумность: 20 тонн");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tanker{");
        sb.append("name='").append(name).append('\'');
        sb.append(", propeller=").append(getPropeller());
        sb.append('}');
        return sb.toString();
    }
}
