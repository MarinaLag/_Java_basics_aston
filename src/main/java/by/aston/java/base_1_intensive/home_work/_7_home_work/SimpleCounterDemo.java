package by.aston.java.base_1_intensive.home_work._7_home_work;

public class SimpleCounterDemo {
    public static void main(String[] args) {
        SimpleCounterWorker scw1 = new SimpleCounterWorker("A");
        SimpleCounterWorker scw2 = new SimpleCounterWorker("B");

        scw1.runCounter(15);
        scw2.runCounter(15);
    }
}
