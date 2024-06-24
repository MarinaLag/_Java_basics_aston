package by.aston.java.base_1_intensive.home_work._6_home_work.nio;

import by.aston.java.base_1_intensive.home_work._6_home_work.Person;

import java.io.*;
import java.nio.file.*;


public class PersonWriteRead {
    public static void main(String[] args) throws IOException {
        Person tom = new Person("Tom", 40, 1.68, false);
        String wayFile = "src/main/resources/data.bin";

        Path path = Path.of(wayFile);
        // считать persona
        Files.lines(path).forEach(System.out::println);
        // записать
    /*    File file = new File(wayFile);
        PrintWriter pw = new PrintWriter(file);
        pw.write(tom.name);
        pw.write(String.valueOf(tom.age));
        pw.write(String.valueOf(tom.height));
        pw.write(String.valueOf(tom.married));
        pw.flush();
        pw.close();
*/
        //  readDataFromFile



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
    private static void readDataFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/task_4/example_5/text_from.txt"))) {
            String line = br.readLine();
            String[] data = line.split(" ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            double height = Double.parseDouble(data[2]);
            boolean married = Boolean.parseBoolean(data[3]);
            System.out.printf("Name: %s  Age: %d  Height: %.2f  Married: %b",
                    name, age, height, married);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
