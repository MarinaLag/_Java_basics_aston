package by.aston.java.base_1_intensive.home_work._2_home_work.task_2;


public class LowLevelLanguage extends ProceduresLanguage {
    public LowLevelLanguage() {
    }

    public LowLevelLanguage(String nameLanguage) {
        super(nameLanguage);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("низкого уровня \n");

    }


}
