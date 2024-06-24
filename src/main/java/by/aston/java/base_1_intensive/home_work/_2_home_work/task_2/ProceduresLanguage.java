package by.aston.java.base_1_intensive.home_work._2_home_work.task_2;

public abstract class ProceduresLanguage extends ProgrammingLanguage{

    public ProceduresLanguage() {
    }

    public ProceduresLanguage(String nameLanguage) {
        super(nameLanguage);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("процедурный");
    }
}
