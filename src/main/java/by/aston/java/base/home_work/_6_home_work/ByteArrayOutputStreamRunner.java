package by.aston.java.base.home_work._6_home_work;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

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
