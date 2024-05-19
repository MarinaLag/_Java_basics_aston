package by.aston.java.base.home_work._7_home_work;

public class ThreadCounterDemo {
    public static void main(String[] args) {
        TreadCounterWorked tcw1 = new TreadCounterWorked("A", 15);
        TreadCounterWorked tcw2 = new TreadCounterWorked("B", 15);

        tcw1.start();
        tcw2.start();

        System.out.println("Start main");
    }
}
