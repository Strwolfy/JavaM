package Дженерикс.Start;

import java.util.Collection;
import java.util.Iterator;

public class Sorr {

    void dump(Collection<Object> c) {   // Dump просто для красоты
        for (Iterator<Object> i = c.iterator(); i.hasNext(); ) {
            Object o = i.next();
            System.out.println(o);
        } }
    <T> void addAll(T[] a, Collection<T> c) { // не знаю что за хрень
        for (int i = 0; i < a.length; i++) {    // но компилируемая
            c.add(a[i]);
        }
    }
}
