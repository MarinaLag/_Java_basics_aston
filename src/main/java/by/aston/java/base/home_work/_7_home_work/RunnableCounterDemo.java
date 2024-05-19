package by.aston.java.base.home_work._7_home_work;

public class RunnableCounterDemo {
    public static void main(String[] args) {
        RunnableCounterWorker scw1 = new RunnableCounterWorker("A", 15);
        RunnableCounterWorker scw2 = new RunnableCounterWorker("B", 15);

        Thread t1 = new Thread(scw1); // состояние new
        Thread t2 = new Thread(scw2);
        t1.start();  // сстояние runnable
        t2.start();

        try {
            t1.join();
          //  t2.join();
        }catch (InterruptedException e){
            throw new RuntimeException();
        }

        System.out.println("Process is finished");
    }
}
