package by.aston.java.base_2_intensive._2_primitives;

import static java.lang.Byte.parseByte;
import static java.lang.Short.parseShort;

public class Main {
    public static void main(String[] args) {
        byte x1 =5;
        byte x2 =3;
        byte x = (byte) (x1+x2);

        short h = 257;
        byte n = (byte) h;
        String s = "127";
        byte jj = parseByte(s);
        System.out.println(parseByte(s));

        String s1 = "32767";
        short sh = parseShort(s1);
        System.out.println(sh);

        short k = (short) 32800;
        System.out.println(k);

        long b = 214748364;
        long b1 = 9999999999l;

        System.out.println("=================");
        char m = 'a';
        char m1 = 'b';


        float o = 5.5f;
        float o1 = (float) 5.5;

        float oo = o+o1;
        System.out.println(oo);

        double c = 10.0/3;
        System.out.println(c);




    }
}
