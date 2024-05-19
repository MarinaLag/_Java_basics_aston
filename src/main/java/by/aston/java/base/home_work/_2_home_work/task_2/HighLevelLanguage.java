package by.aston.java.base.home_work._2_home_work.task_2;



public class HighLevelLanguage  extends ProceduresLanguage{
    public HighLevelLanguage() {
    }

    public HighLevelLanguage(String nameLanguage) {
        super(nameLanguage);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("высокого уровня \n");
    }
}
