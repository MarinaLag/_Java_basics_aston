package by.aston.java.base_1_intensive.home_work._6_home_work;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamRunner {
    public static void main(String[] args) {
        //  readEachByte();
        System.out.println("--------------------");
        //  readAllBytes();

    }

    private static void readAllBytes() {
        FileInputStream inputStream = null;
        try {
            //   inputStream = new FileInputStream("resources/text.txt");
            inputStream = new FileInputStream("src/main/resources/text1.txt");
            byte[] bytes = inputStream.readAllBytes();
            String stringValue = new String(bytes);
            System.out.println(stringValue);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private static void readEachByte() {
        //  try (FileInputStream inputStream = new FileInputStream("resources/text.txt")) {
        try (FileInputStream inputStream = new FileInputStream("src/main/resources/text1.txt")) {
            byte[] bytes = new byte[inputStream.available()];
            int counter = 0;
            byte currentByte;
            while ((currentByte = (byte) inputStream.read()) != -1) {
                bytes[counter++] = currentByte;
            }
            String stringValue = new String(bytes);
            System.out.println(stringValue);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
