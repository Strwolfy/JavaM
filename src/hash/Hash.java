package hash;

import hash.BlackBox;

public class Hash extends Object {
    public static void main(String[] args) {
        Object obje3ct = new Object();
        int hCode;

        BlackBox object1 = new BlackBox(5, 10);
        BlackBox object2 = new BlackBox(5, 10);

        BlackBox object3 = new BlackBox(5, 10);
        boolean a = object1.hashCode() == object2.hashCode();
        System.out.println("a равно " + a);

        BlackBox object4 = object3;

        boolean b1 = object1.equals(object2);// должно быть true
        System.out.println(object1.hashCode() == object2.hashCode());// должно быть true
        System.out.println(object1.equals(object2));
        boolean b = object3.equals(object4);
        System.out.println(b1);
    }
}
