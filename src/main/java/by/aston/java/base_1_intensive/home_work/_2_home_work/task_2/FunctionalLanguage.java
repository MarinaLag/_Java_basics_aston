package by.aston.java.base_1_intensive.home_work._2_home_work.task_2;



public class FunctionalLanguage extends DeclarationLanguage  {
    public FunctionalLanguage() {
    }

    public FunctionalLanguage(String nameLanguage) {
        super(nameLanguage);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("функциональный \n");
    }
}
