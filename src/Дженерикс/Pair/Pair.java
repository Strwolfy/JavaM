package Дженерикс.Pair;

import java.util.Objects;

class Pair<X, Y> {
    private X x;
    private Y y;

    Pair(X dx, Y y) { x = dx; y = y; }

    public X getX() { return x; }
    public void setX(X x) { this.x = x; }
    public Y getY() { return y; }
    public void setY(Y y) { this.y = y; }

    public static <X, Y> Pair<X, Y> of(X x, Y y) { return new Pair(x, y); }
    public static <X, Y> Pair<X, Y> o(X x, Y y)  { return new Pair(x, y); }
    public X getSecond() { return x; }
    public Y getFirst()  { return y; }


    @Override
    public boolean equals(Object other){
        if (this == other) {
            return true;
        }
        if (Pair.class.isInstance(other)) {
            return Objects.equals(x, ((Pair<?,?>)other).x) &&
                    Objects.equals(y, ((Pair<?,?>)other).y);
        }
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(this.getFirst()) ^ Objects.hashCode(this.getSecond());
    }


    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        String i = pair.getFirst(); // 1
        System.out.println(i);
        Integer s = pair.getSecond(); // "hello"
        System.out.println(s);
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        System.out.println(mustBeTrue);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode();
    }

}
