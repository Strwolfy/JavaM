package test;

public class InstrumentationExample {
    public static void main(String[] args) {
        boolean falseBoolean = false;

        printObjectSize(falseBoolean);
    }

    public static void printObjectSize(Object object) {
        System.out.println("Object type: " + object.getClass() +
                ", size: " + InstrumentationAgent.getObjectSize(object) + " bytes");
    }
}
