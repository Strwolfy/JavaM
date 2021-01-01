package Дженерикс.Box;

public class Utils {

    public static <T extends Comparable<T>> T minElement(T[] values) {

        if (values.length == 0) {
            return null;
        }

        T min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (min.compareTo(values[i]) > 0) {
                min = values[i];
            }
        }

        return min;
    }
}