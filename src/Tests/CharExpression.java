package Tests;

public class CharExpression {
    public static char charEx(int a) {
        return (char) ('\\' + a);
    }
    public static char charExpr(int a) {
        int s = '\\' + a;
        return (char) s;
    }
    public static char charExprFull(int a) {
        int s = '\\';
        int total = s + a;
        char u = (char) total;
        return u;
    }
}
