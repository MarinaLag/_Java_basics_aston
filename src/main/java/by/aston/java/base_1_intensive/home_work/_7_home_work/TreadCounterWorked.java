package by.aston.java.base_1_intensive.home_work._7_home_work;

public class TreadCounterWorked extends Thread{
    private final String name;
    private final Integer range;

    public TreadCounterWorked(String name, Integer range) {
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
