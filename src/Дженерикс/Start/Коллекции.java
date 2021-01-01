package Дженерикс.Start;

import java.util.*;

public class Коллекции {
    public static void main(String[] args) {
        // объявление коллекции
        int[] array = new int[15];
        List collection =  new ArrayList();
        Set collection2 = new HashSet();
        Queue collection3 = new PriorityQueue();

        //Collection collection = new ArrayList();
        //Collections collections;
        //Arrays arrays;
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add(3, "5");
        System.out.println(collection.get(2));
        collection.remove("2");
        Iterator iterator = collection.iterator();
        // методы хэз некст и некст
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Object o: collection) {
            System.out.println(o);
        }
    }
}
