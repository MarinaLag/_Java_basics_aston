package by.aston.java.base_1_intensive.home_work._7_home_work;

public class ThreadCounterWithDaemonWorker extends Thread{
    private final String name;
    private final Integer range;

    public ThreadCounterWithDaemonWorker(String name, Integer range, boolean isDaemon) {
        this.name = name;
        this.range = range;
        super.setDaemon(isDaemon);
    }

    @Override
    public void run() {
        int count =0;
        while (count<=range){
            System.out.println(name + " : " + count++);
        }
        System.out.println(name + " counter finished the work");
    }
}
