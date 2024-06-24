package by.aston.java.base_1_intensive.home_work._2_home_work.task_3;

public class Main {
    public static void main(String[] args) {
        Airplanes airplanes = new Airplanes("Самолет");
        System.out.println(airplanes);
        airplanes.carry();

        Helicopter helicopter = new Helicopter("Вертолет");
        System.out.println(helicopter);
        helicopter.carry();

        Boat boat = new Boat("Катер");
        System.out.println(boat);
        boat.carry();

        Tanker tanker =new Tanker("Танкер");
        System.out.println(tanker);
        tanker.carry();

        Truck truck = new Truck("Грузовик");
        System.out.println(truck);
        truck.carry();

        Taxi taxi = new Taxi("Такси");
        System.out.println(taxi);

    }
}
