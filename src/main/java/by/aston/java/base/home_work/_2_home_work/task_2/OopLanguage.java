package by.aston.java.base.home_work._2_home_work.task_2;



public class OopLanguage extends NonProceduralLanguage {
    public OopLanguage() {
    }

    public OopLanguage(String nameLanguage) {
        super(nameLanguage);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("ООП \n");
    }
}
