package by.aston.java.base.home_work._6_home_work.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelWrite {
    public static void main(String[] args) throws IOException {

        explicitChannelWrite();
        mappedChannelWrite();
    }

    // выделение оперативной памяти под буфер в ручную
    private static void explicitChannelWrite() {
        // получаем канал к файлу
        try (FileChannel fileChannel = (FileChannel)
                Files.newByteChannel(Paths.get("src/main/resources/text1.txt"),
                        StandardOpenOption.WRITE,
                        StandardOpenOption.CREATE)) {

            ByteBuffer byteBuffer = ByteBuffer.allocate(10);

            String value = "Java";
            byteBuffer.put(value.getBytes());
            // подготовить буфер к записи
            byteBuffer.rewind();
            //записать данные из буфера в выходной файл
            fileChannel.write(byteBuffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
// автоматич запись без дополнительныз методов
    private static void mappedChannelWrite() {
// получаем канал к файлу
        try (FileChannel fileChannel = (FileChannel)
                Files.newByteChannel(Paths.get("src/main/resources/text1.txt"),
                        StandardOpenOption.WRITE,
                        StandardOpenOption.READ,
                        StandardOpenOption.CREATE)) {
// сопоставляется файл с буфером
            MappedByteBuffer mBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 10);
            String value = "JavaScript";
            mBuffer.put(value.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
