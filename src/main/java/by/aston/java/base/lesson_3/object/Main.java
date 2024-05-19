package by.aston.java.base.lesson_3.object;

public class Main {
    public static void main(String[] args) {
        Programm programm1 = new Programm("Java",8);
        Programm programm2 = new Programm("Java",8);

        System.out.println(programm1==programm2);
        System.out.println(programm1.hashCode());
        System.out.println(programm2.hashCode());


    }
}
