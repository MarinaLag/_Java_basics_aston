package by.aston.java.base_1_intensive.home_work._2_home_work.task_2;

public abstract class ProgrammingLanguage {
    String nameLanguage;

    public ProgrammingLanguage() {
    }

    public ProgrammingLanguage(String nameLanguage) {
        this.nameLanguage = nameLanguage;
    }

    public String getNameLanguage() {
        return nameLanguage;
    }

    public void print() {
        System.out.println(nameLanguage + ":\n" + "это язык программирования ");
    }

}
