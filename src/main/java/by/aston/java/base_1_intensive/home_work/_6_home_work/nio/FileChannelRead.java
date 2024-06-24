package by.aston.java.base_1_intensive.home_work._6_home_work.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileChannelRead {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/main/resources/text1.txt");
        Files.lines(path).forEach(System.out::println);

        System.out.println("===============");
        explicitChannelRead();
        System.out.println("==============");
        mappedChannelRead();
    }
    private static void explicitChannelRead() {
        /* получить путь и передать в канал
        Path filepath = null;
        try {
            filepath = Paths.get("src/main/resources/text1.txt");
        }catch (InvalidPathException e){
            System.out.println("Path Error " + e);
        }
        try (FileChannel channel = Files.newByteChannel(filepath)) {
        */

        // получили канал - передали путь к файлу
        try (FileChannel fileChannel = (FileChannel)
                Files.newByteChannel(Paths.get("src/main/resources/text1.txt"))) {
            //    выделили память под буфер
            ByteBuffer byteBuffer = ByteBuffer.allocate(100);
            // считали
            while (fileChannel.read(byteBuffer) != -1) { // -1 прекратить чтение
                byteBuffer.flip(); // меняет режим чтения
                while (byteBuffer.hasRemaining()) {
                    System.out.println((char) byteBuffer.get()); // вывод в консоль
                }
                byteBuffer.clear(); // очистит
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void mappedChannelRead(){
        try (FileChannel fileChannel = (FileChannel)
                Files.newByteChannel(Paths.get("src/main/resources/text1.txt"))){
            // получаем размер файла
            long fSize = fileChannel.size();
            // отобразим файл в буфере
            MappedByteBuffer mByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY,0,fSize);
            // читаем и выводим
           for (int i=0; i<fSize; i++){
               System.out.println((char) mByteBuffer.get());
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
