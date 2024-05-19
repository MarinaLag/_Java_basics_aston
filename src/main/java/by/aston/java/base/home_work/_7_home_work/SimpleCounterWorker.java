package by.aston.java.base.home_work._7_home_work;

public class SimpleCounterWorker {
    private final String name;

    public SimpleCounterWorker(String name) {
        this.name = name;
    }
    public  void runCounter(int range){
        int count =0;
        while (count<=range){
            System.out.println(name + " : " + count++);
        }
    }
}
