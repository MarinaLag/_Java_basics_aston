package by.aston.java.base.home_work._7_home_work;

public class ThreadCounterWithDaemonDemo {
    public static void main(String[] args) {
        ThreadCounterWithDaemonWorker tcw1 = new ThreadCounterWithDaemonWorker("A", 110,true); // демон
        ThreadCounterWithDaemonWorker tcw2 = new ThreadCounterWithDaemonWorker("B", 15,false);

        tcw1.start();
        tcw2.start();

        System.out.println("Start main");
    }
}
