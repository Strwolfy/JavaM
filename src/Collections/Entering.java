package Collections;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * как мы считываем байты. Допустим считали в Reader,
 * как вывести?
 *
 * */

public class Entering {


    public static Map<String, Long> getSalesMap(Reader reader)  {

        BufferedReader read = new BufferedReader(reader);
        Map<String, Long> map = new HashMap<>();
        String Line = null;
        String text = null;

        while(true) {
            try {
                if ((Line = read.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            String name = Line.trim().split(" ")[0];
            Long salary = Long.parseLong((Line.trim().split(" ")[1]));
            map.put(name, salary);

        }

        return map;
    }
        //Line = reader.readLine();

    Map<String, Long> map = new HashMap<>();

        /*while((Line = reader.readLine()) != null) {
            String name = Line.trim().split(" ")[0];
            Integer salary = Integer.parseInt(Line.trim().split(" ")[1]);
            map.put(name, salary);
        }
*/
/*        BufferedReader read = (BufferedReader) Reader;
        String Line;
        // ниже вывод на экран входящего буфера (потока)
        while (read.ready()) {
            Line = read.readLine();
            System.out.println(Line);
        }
        while((Line = read.readLine()) != null) {
            String name = Line.trim().split(" ")[0];
            Integer salary = Integer.parseInt(Line.trim().split(" ")[1]);
            map.put(name, salary);
        }

*/
      //  System.out.println(map.get("Алексей"));
      //  System.out.println(map.get("Алексй"));



    public static void main(String[] args) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(("Алексей 3000" +
                "\nДмитрий 9000\nАнтон 3000\nАлексей 7000\nАнтон 8000").getBytes());
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(bais));
        getSalesMap(buffReader);
/*
        Reader reader = new FileReader("test.txt");
        for (Collections.Map.Entry<String, Integer> entry : getSalesMap(reader).entrySet()) {
            System.out.println(entry);
        } */


        //  int d = reader.read();
        //boolean b = reader.ready();
       // System.out.println(b);


        /*for (Collections.Map.Entry<String, Integer> entry : getSalesMap(reader).entrySet()) {
            System.out.println(entry);
        }*/

    }


}
