package by.aston.java.base_1_intensive.home_work._2_home_work.task_2;

public class Main {
    public static void main(String[] args) {
       LowLevelLanguage lowLevelLanguage = new LowLevelLanguage("Ассемблер");
       lowLevelLanguage.print();

       HighLevelLanguage highLevelLanguage = new HighLevelLanguage("Фортран, Бейсик, Паскаль,Си");
       highLevelLanguage.print();

       OopLanguage oopLanguage = new OopLanguage("Java, Cи++, Visual Basic");
       oopLanguage.print();

       LogicalLanguage logicalLanguage = new LogicalLanguage("Пролог");
       logicalLanguage.print();

       FunctionalLanguage functionalLanguage = new FunctionalLanguage("Лисп");
       functionalLanguage.print();




    }
}
