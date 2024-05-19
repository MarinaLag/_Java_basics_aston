package by.aston.java.base.home_work._6_home_work;

import by.aston.java.base.lesson_2.Main;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BufferedOutputStreamRunner {
    public static void main(String[] args) {

        String text = "Hello Java world!"; // строка для записи

      /*  try (FileOutputStream out = new FileOutputStream("resources/text3.txt");
             BufferedOutputStream bos = new BufferedOutputStream(out)) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();
            bos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
*/
        try (FileChannel fileChannel = (FileChannel)
                Files.newByteChannel(Paths.get("src/main/resources/text1.txt"),
                        StandardOpenOption.WRITE,
                        StandardOpenOption.READ,
                        StandardOpenOption.CREATE)) {
            MappedByteBuffer mBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, text.length());
            mBuffer.put(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

