package by.aston.java.base_1_intensive.home_work._6_home_work;

import java.io.*;

public class DataIoStreamRunner {
    public static void main(String[] args) {

        Person tom = new Person("Tom", 34, 1.68, false);
        // запись в файл
        //writeDataToFile(tom);

        // обратное считывание из файла
        readDataFromFile();
    }

    private static void writeDataToFile(Person tom) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/main/resources/data.bin"))) {
            // записываем значения
            dos.writeUTF(tom.name);
            dos.writeInt(tom.age);
            dos.writeDouble(tom.height);
            dos.writeBoolean(tom.married);
            System.out.println("File has been written");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void readDataFromFile() {
        try (DataInputStream dos = new DataInputStream(new FileInputStream("data.bin"))) {
            // записываем значения
            String name = dos.readUTF();
            int age = dos.readInt();
            double height = dos.readDouble();
            boolean married = dos.readBoolean();
            System.out.printf("Name: %s  Age: %d  Height: %f  Married: %b",
                    name, age, height, married);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

