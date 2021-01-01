package Дженерикс.Box;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class i {


    //private static final int  = 809;   MONDAY, FRIDAY, SUNDAY, TUESDAY



    private static final int SUBSCRIBER = 5;
    private static final int FREE_TRIAL = 6;

    public static Map<String, Integer> getSalesMap(Reader reader) throws IOException {
        BufferedReader read = (BufferedReader) reader;
        Map<String, Integer> map = new HashMap<>();
        // String это ключ, key
        // Integer - значение, число, value
        String line;

        //String line = read.readLine();
        //System.out.println(line);
        while((line = read.readLine()) != null) {
            String name = line.trim().split(" ")[0];
            System.out.println(name);
            Long salary = Long.parseLong(line.trim().split(" ")[1]);
            System.out.println(salary);
            /*if (map.contains(name)) {
                map.put(name, map.getValue(name) + salary);
            } else {
                map.put(name, salary);
            }*/
        }


        return new HashMap<String, Integer>();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println(getSalesMap(reader));
        reader.close();

        var myName = "Marco";
        "Marco".isBlank();
        "Mar\nco".lines();
        "Marco  ".strip();
        Path path = Files.writeString(Files.createTempFile("helloworld", ".txt"), "Hi, my name is!");
        String s = Files.readString(path);

       // (var firstName, var lastName) -> firstName + lastName;
        int status = 5;
        boolean result = switch (status) {
            case SUBSCRIBER -> true;
            case FREE_TRIAL -> false;
            default -> throw new IllegalArgumentException("something is murky!");
        };
    }
    String htmlBeforeJava13 = "<html>\n" +
            "    <body>\n" +
            "        <p>Hello, world</p>\n" +
            "    </body>\n" +
            "</html>\n";
    String htmlWithJava13 = """
              <html>
                  <body>
                      <p>Hello, world</p>
                  </body>
              </html>
              """;
   /*
    int numLetters = switch (day) {
        case MONDAY, FRIDAY, SUNDAY -> 6;
        case TUESDAY                -> 7;
        default      -> {
            String s = day.toString();
            int result = s.length();
            yield result;
        }
    };*/


}

