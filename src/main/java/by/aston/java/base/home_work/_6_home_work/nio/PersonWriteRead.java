package by.aston.java.base.home_work._6_home_work.nio;

import by.aston.java.base.home_work._6_home_work.Person;

import java.io.*;
import java.nio.file.*;


public class PersonWriteRead {
    public static void main(String[] args) throws IOException {
        Person tom = new Person("Tom", 40, 1.68, false);

        String wayFile = "src/main/resources/data.bin";

        Path path = Path.of(wayFile);

 // записать
        File file = new File(wayFile);
        PrintWriter pw = new PrintWriter(file);

        pw.write(tom.name);
        pw.write(String.valueOf(tom.age));
        pw.write(String.valueOf(tom.height));
        pw.write(String.valueOf(tom.married));

        pw.flush();
        pw.close();

// считать persona
        Files.lines(path).forEach(System.out::println);




        try {
            //Создайте новый файл
            File f = new File(wayFile);
            // Убедитесь, что он не существует
            if (f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        }
        catch (Exception e) {
            System.err.println(e);
        }


    }
}
