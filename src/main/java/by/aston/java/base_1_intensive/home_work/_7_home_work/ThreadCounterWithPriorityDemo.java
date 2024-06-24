package by.aston.java.base_1_intensive.home_work._7_home_work;

public class ThreadCounterWithPriorityDemo {
    public static void main(String[] args) {
        ThreadCounterWithPriorityWorker tcw1 = new ThreadCounterWithPriorityWorker("A", 15,2);
        ThreadCounterWithPriorityWorker tcw2 = new ThreadCounterWithPriorityWorker("B", 15,10);

        tcw1.start();
        tcw2.start();

        System.out.println("Start main");
    }
}
