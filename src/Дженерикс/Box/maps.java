package Дженерикс.Box;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class maps {

    public static Map<String, Integer> getSalesMap(Reader reader) throws IOException {

        Map<String, Integer> map = new HashMap<>();
        Reader line = reader;


        //while((line = reader.read()) != null) {

         //   String name = line.trim().split(" ")[0];
           // Integer salary = Integer.parseInt(line.trim().split(" ")[1]);
           // map.put(name, salary);
        //}
        return map;
    }


    public static Map<String, Long> getSalesMa(Reader reader) throws IOException {
        BufferedReader br = new BufferedReader(reader);
        String thisLine = null;
        HashMap<String, Long> map = new HashMap<String, Long>();
        thisLine = br.readLine();
        String[] part = thisLine.split("(?<=\\D)(?=\\d)");
        //part = thisLine.split("[^A-Z0-9]+|(?<=[A-Z])(?=[0-9])|(?<=[0-9])(?=[A-Z])");
        for (int j = 0; j < part.length; j = j + 2) {
            int a = Integer.parseInt(part[j + 1]);
            map.put(part[j], (long) a);
        }
        return map;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(getSalesMa(reader));
        reader.close();
    }
}
