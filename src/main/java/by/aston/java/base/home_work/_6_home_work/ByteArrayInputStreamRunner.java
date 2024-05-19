package by.aston.java.base.home_work._6_home_work;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ByteArrayInputStreamRunner {
    public static void main(String[] args) throws IOException {

       // readAllBytes();
        // readFiveChars();
        readAllBytesNio();
    }

    private static void readAllBytes() {
        byte[] array1 = new byte[]{1, 3, 5, 7};
        ByteArrayInputStream byteStream1 = new ByteArrayInputStream(array1);
        int b;
        while ((b = byteStream1.read()) != -1) {
            System.out.println(b);
        }
    }

    private static void readFiveChars() {
        String text = "Hello world!";
        byte[] array2 = text.getBytes();
        // считываем 5 символов
        ByteArrayInputStream byteStream2 = new ByteArrayInputStream(array2, 0, 5);
        int c;
        while ((c = byteStream2.read()) != -1) {
            System.out.println((char) c);
        }
    }

    private static void readAllBytesNio() throws IOException {
        byte[] array3 = new byte[]{10,12,13,14};

        ByteBuffer byteBuffer =ByteBuffer.allocate(array3.length); // выделили память для буфера
       // byteBuffer.
      //  byteBuffer.put(array3); // копирует в буффер элементы из массива
       // byteBuffer.get(array3);


      //  byteBuffer.flip(); // меняет режим чтения
       //byteBuffer.clear(); // очистит






    }
}
