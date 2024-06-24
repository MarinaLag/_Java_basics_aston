package by.aston.java.base_1_intensive.home_work._6_home_work;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamRunner {
    public static void main(String[] args) throws IOException {
        System.out.println();
    //    try (FileOutputStream outputStream = new FileOutputStream("resources/text1.txt", true)) {
        try (FileOutputStream outputStream = new FileOutputStream("src/main/resources/text1.txt", true)) {
            String value = "Hello World2!";
            outputStream.write(value.getBytes());
//            outputStream.write(System.lineSeparator().getBytes());
        }






    }
}
