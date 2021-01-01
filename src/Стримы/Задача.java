package Стримы;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Задача {
    public static Map<String, Long> getSalesMap(Reader reader) throws IOException {
        //BufferedReader read = (BufferedReader) reader;
        Map<String, Long> map = new HashMap<>();

        Scanner scanner = new Scanner(reader);

        scanner.nextLine();

        while (scanner.hasNext()) {
            String line = scanner.next();
            if (scanner.hasNextLong()) {
                map.merge(line, scanner.nextLong(), Long::sum);
            }
        }

        for(Map.Entry<String, Long> entry: map.entrySet()) {
            System.out.println(entry);
        }
        if (!map.isEmpty()) {
            System.out.println(map);
        }

    /*      for (Map.Entry<String, Long> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        } // но тут не полный вывод. Тут перезапись старых
    */       // ключей новыми

        return map;
    }
    public static void main(String[] args) throws IOException {

        // Допустим мы передали байтовый поток
/*        ByteArrayInputStream bais = new ByteArrayInputStream(("Алексей 3000" +
                "\nДмитрий 9000\nАнтон 3000\nАлексей 7000\nАнтон 8000").getBytes());
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(bais));
*/
        Reader reader = new FileReader("text.txt");
        Scanner scanner = new Scanner(reader);

        for (Map.Entry<String, Long> entry : getSalesMap(reader).entrySet()) {
            System.out.println(entry);
        }


        //getSalesMap(buffReader);
    }
}
