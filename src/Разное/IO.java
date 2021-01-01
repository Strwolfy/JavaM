package Разное;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IO {
    public static void main(String[] args) throws IOException {
        File file = new File("d.txt");
        // сепаратор
        char f = file.pathSeparatorChar;
        System.out.println(f);
        // абсолютный путь
        File s = file.getAbsoluteFile();
        System.out.println(s);
        // проверка на абсолютность
        //System.out.println("Проверка на абсолютность");
        boolean g1 = file.isAbsolute();
        System.out.println(g1);
        // получить путь
        String s1 = file.getPath(); // только путь
        System.out.println(s1);

        String s2 = file.getName();
        System.out.println(s2);

        boolean b =  file.exists();
        boolean b1 = file.isFile();
        System.out.println(b1);
        //
        boolean w;
        if (file.createNewFile()) w = true;
        else w = false;
        System.out.println(w);
        String p = file.getAbsolutePath();
        System.out.println(p);

        File dir = new File("C:\\Users\\Михаил\\Desktop\\dir\\e\\a");
        boolean dir1 = dir.mkdirs();
        System.out.println(dir1);

        //Path e = new Paths.get("ddd.txt");
        //Path path = new Paths.get("/e/t.txt");


       // Files.createDirectories(path);
    }
}
