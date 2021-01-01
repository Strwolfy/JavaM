package Факториал;
import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        fact(-10);
    }
    public static BigInteger fact(int value) {
        BigInteger result;
        if (value == 1 || value == 0) {
            result = BigInteger.valueOf(1);
            return result;
        }
        result = BigInteger.valueOf(value).multiply(fact(value-1));
        System.out.println("Результат " + result);
        return result;
    }

    public static BigInteger factorial(int value) {

        BigInteger result = BigInteger.valueOf(1);
        for(int i = 1; i <= value; i++) {
            BigInteger val = BigInteger.valueOf(i);
            result = val.multiply(result);
        }
        return result;
    }
}
