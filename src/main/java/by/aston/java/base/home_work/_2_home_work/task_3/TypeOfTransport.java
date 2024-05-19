package by.aston.java.base.home_work._2_home_work.task_3;

import by.aston.java.base.home_work._2_home_work.task_3.inners.AirplaneWings;
import by.aston.java.base.home_work._2_home_work.task_3.inners.Propeller;
import by.aston.java.base.home_work._2_home_work.task_3.inners.Wheels;

public abstract class TypeOfTransport {
    String name;

    public TypeOfTransport() {
    }

    public TypeOfTransport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
