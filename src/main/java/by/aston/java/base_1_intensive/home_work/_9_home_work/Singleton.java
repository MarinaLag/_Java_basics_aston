package by.aston.java.base_1_intensive.home_work._9_home_work;

public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
    }
    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
            return instance;
        }
        return null;
    }



    public static void main(String[] args) {
        Singleton singleton1 = getInstance();
        Singleton singleton2 = getInstance();
        Singleton singleton3 = getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);
    }
}
