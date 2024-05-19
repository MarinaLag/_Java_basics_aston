package by.aston.java.base.home_work._7_home_work;

public class RunnableCounterWorker implements Runnable{
    private final String name;
    private final Integer range;

    public RunnableCounterWorker(String name, Integer range) {
        this.name = name;
        this.range = range;
    }

    @Override
    public void run() {
        int count =0;
        while (count<=range){
            System.out.println(name + " : " + count++);
        }
    }
}
