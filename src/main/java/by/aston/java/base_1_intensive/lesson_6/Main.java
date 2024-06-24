package by.aston.java.base_1_intensive.lesson_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //   System.out.println(list.get(2));

//        try {
//            int[] number = new int[3];
//            number[4] = 45;
//            System.out.println(number[4]);
//        } catch (Exception exception) {
//            exception.printStackTrace();
//            System.out.println(exception.getMessage());
//            System.out.println(exception); // toString()
//            System.err.println(exception);
//
//        }



        System.out.println("Программа завершена");

        int[] number1 = new int[3];
        try {
       //     openDB();
          //  number1[4] = 45;
            number1[0]=10;
         //   System.out.println(number1[4]);
        } finally {
         //   closeDB();
        }
        System.out.println("number1 " + Arrays.toString(number1));

    }
//    public void calculate(int n) throws Exception
//    {
//        if (n == 0)
//            throw new Exception("n равно нулю!");
//    }

    public void calculate(int n) {
        if (n == 0)
            throw new RuntimeException("n равно нулю!");
    }
}
