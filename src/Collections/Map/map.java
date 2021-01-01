package Collections.Map;

import java.util.HashMap;

public class map {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("key", 2);
        map.put("key1", 7);
        map.put("key2", 8); // второй затрёт если ключи одинаковые
        map.put("key3",20);

        System.out.println(map);

        // ключ уникальный а значения могут повторяться
        // доступ к значениям в HashMap только по ключу
        // есть два метода get и remove по ключу: добавление и удаление
        // containsKey и containsValue - получить значение по ключу и значению
    }
}
