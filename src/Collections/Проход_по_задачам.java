package Collections;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Проход_по_задачам {

    // задача вывода суммы входящего потока
    // пример ввода: 1, 2, 4, 10. Пример вывода: 17
    public int sumOfStream(InputStream inputStream) throws IOException {
        int buff;
        int result = 0;
        while ((buff = inputStream.read()) != -1) {
            result += (byte) buff;
        }
        return result;
    }
    // пример задачи, которая принимает значения, читает из входящего потока
    // и записывает в исходящий поток только чётные значения
    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int buff;
        int result = 0;
        while ((buff = inputStream.read()) != -1) {
            if (buff %2 == 0) {
                outputStream.write(buff);
            }
        }
        outputStream.flush();
    }
    public static void main(String[] args) {

    }
}
