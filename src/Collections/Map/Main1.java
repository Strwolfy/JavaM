package Collections.Map;

import java.util.*;


public class Main1 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "string 1");
        map.put(2, "string 2");
        map.put(3, "string 3");

        String string1 = map.get(1);
        String string2 = map.get(2);
        String string3 = map.get(3);
        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
        }

        //  Как отсортировать значения мапы
        List<Map.Entry<Integer, String>> valuesList = new ArrayList(map.entrySet());
        List<Map.Entry<Integer, String>> list = null;
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
