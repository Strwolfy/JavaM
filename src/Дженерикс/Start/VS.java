package Дженерикс.Start;

import java.util.HashMap;
import java.util.Map;

public class VS {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        updateValue(map, "Алексей", 3000);
        updateValue(map, "Дмитрий", 9000);
        updateValue(map, "Антон", 3000);
        updateValue(map, "Алексей", 7000);
        updateValue(map, "Антон", 8000);

        System.out.println(map.toString());
    }


    public static void updateValue(Map<String, Integer> map, String key, Integer value) {
        if (map.containsKey(key)) {
            map.put(key, map.get(key) + value);
        } else {
            map.put(key, value);
        }
    }
}
