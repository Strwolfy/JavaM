package Tests;

public class Степень {
    public static boolean isPowerOfTwo(int value) {
        int v = Math.abs(value);
        v = Integer.bitCount(v);
        return  v == 1;
    }
}
