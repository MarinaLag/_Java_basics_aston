package by.aston.java.base.lesson_4.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List <String> list = new ArrayList<>();
//        list.add("25");
//        list.add("33");
//        list.add("2");
//
////        String v1 = (String) list.get(0);
////        System.out.println(v1);
//
//
//        Integer integer = 22;
//        Number number = 33;
//        number=integer;
//        System.out.println("number " + number);
//
//
//        String string = new String("JAva");
//        Object object = string;
//        System.out.println(object);
//        object = string;
//        System.out.println(object);

        List<Integer> intList = new ArrayList<>();
        intList.add(2);
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(55.5);
//        List<String> string= new ArrayList<>();
//        string.add("JAva");

        List <? extends Number> numbers = intList;
        for (Number i : numbers) {
            System.out.println(i);
        }


        List<Number> num = new ArrayList<>();
        num.add(100);
        List<Object> ob = new ArrayList<>();
        ob.add("50000");
        List<String> string= new ArrayList<>();
        string.add("JAva");

        List<?super Number> res = ob;
        for (Object re : res) {
            System.out.println(re);
        }


        List<Number> numDouble = Arrays.asList(3.3,5.5);
        List<Integer> numInt = Arrays.asList(1,1);

        for (Number number : numDouble) {
            System.out.println(number);
        }

        Collections.copy(numDouble,numInt);

        for (Number number : numDouble) {
            System.out.println(number);
        }

        for (Number number : numInt) {
            System.out.println(number);
        }


    }

}
