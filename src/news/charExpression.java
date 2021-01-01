package news;

public class charExpression {

    public static char charExpression(int a) {
        int s = '\\';
        int total = s + a;
        char u = (char) total;
        return u;
    }

    public static boolean isPowerOfTwo(int value) {
        int v = Math.abs(value);
        v = Integer.bitCount(v);
        return  v == 1;
    }

    public static boolean isPowerOf(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }


    public static char chari(int a) {
        return (char) ((char) '\\' + a);

    }

    public static void main(String[] args) {
        char r = chari(187);
        System.out.println(r);
        System.out.println(isPowerOf(5));
    }
}
