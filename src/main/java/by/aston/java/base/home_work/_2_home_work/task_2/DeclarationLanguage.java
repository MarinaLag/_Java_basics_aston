package by.aston.java.base.home_work._2_home_work.task_2;

public class DeclarationLanguage extends NonProceduralLanguage{
    public DeclarationLanguage() {
    }

    public DeclarationLanguage(String nameLanguage) {
        super(nameLanguage);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("декларативный");
    }
}
