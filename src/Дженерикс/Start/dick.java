package Дженерикс.Start;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dick {
    static Scanner scn;
    public static void main(String[] args) throws FileNotFoundException {


        openfile();
        readfile();
        out();
    }

    private static void out() {
    }

    private static void readfile() {
    }

    private static void openfile() throws FileNotFoundException {
        scn = new Scanner(new File("res//1.txt"));
    }
}
