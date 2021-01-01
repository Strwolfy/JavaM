package Разное;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Файл {
    public static void main(String[] args) {
        String dirPath = "/";
        File file = new File(dirPath);
        File[] files = file.listFiles();

        String d = File.pathSeparator;
        System.out.println(d);

        System.out.println(Arrays.stream(files).toArray());

        Path path = Paths.get("C:\\New\\Chap3.java");
        Path testFilePath = Paths.get("C:\\Users\\testFile.txt");

    }
}
