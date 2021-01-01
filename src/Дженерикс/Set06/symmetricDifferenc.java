package Дженерикс.Set06;

import java.util.HashSet;
import java.util.Set;

class symmetricDifferenc {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> set = new HashSet<>();
        set.addAll(set1);
        set.addAll(set2);

        set.removeIf(item -> set1.contains(item) && set2.contains(item));
        return set;
    }
}
