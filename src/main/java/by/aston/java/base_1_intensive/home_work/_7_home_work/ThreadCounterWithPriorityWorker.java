package by.aston.java.base_1_intensive.home_work._7_home_work;

public class ThreadCounterWithPriorityWorker extends Thread{
    private final String name;
    private final Integer range;

    public ThreadCounterWithPriorityWorker(String name, Integer range, Integer priority) {
        this.name = name;
        this.range = range;
        super.setPriority(priority);
    }

    @Override
    public void run() {
        int count =0;
        while (count<=range){
            System.out.println(name + " : " + count++);
        }
    }
}
