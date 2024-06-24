package by.aston.java.base_1_intensive.home_work._6_home_work;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamRunner {
    public static void main(String[] args) {

        String text = "Hello World!";

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            byte[] buffer = text.getBytes();
            baos.write(buffer);
            // превращаем массив байтов в строку
            System.out.println(baos.toString());
            // получаем массив байтов и выводим по символьно
            byte[] array = baos.toByteArray();
            for (byte b : array) {
                System.out.print((char) b);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
