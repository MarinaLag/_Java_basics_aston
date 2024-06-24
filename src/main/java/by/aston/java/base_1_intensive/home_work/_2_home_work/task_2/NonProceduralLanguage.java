package by.aston.java.base_1_intensive.home_work._2_home_work.task_2;

public abstract class NonProceduralLanguage extends ProgrammingLanguage {

    public NonProceduralLanguage() {
    }

    public NonProceduralLanguage(String nameLanguage) {
        super(nameLanguage);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("непроцедурный");
    }
}
