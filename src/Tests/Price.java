package Tests;

public class Price {
    public static double priceCalculation(double price, int count) {
        return price * count;
    }

    public static boolean doubleExpression(double a, double b, double c) {
        double eps = 0.00001;
        return Math.abs(a + b - c) < eps;
        //a + b == c;
    }
    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }

    public static void main(String[] args) {

        double a = 5, b = 7, c = 12;
        System.out.println(doubleExpression(a , b , c));

        double d = 0x0bp3;
        System.out.println(d);

        char r = CharExpression.charEx(25);
        System.out.println(r);

        System.out.println(isPowerOfTwo(-2));
        //System.out.println(" И равно " + i1);
        //boolean b = i%2;
        //System.out.println(a1);

        String s = "Hello world";
        s = s.replace("o", "i");
        System.out.println(s);
/*
        "A" + ('\t' + '\u0003')
        'A' + '1' + "2"
        "A" + 12
        'A' + "12"*/
                String o = 'A' + "12";
        System.out.println(o);

    }
}
