package Tests;

public class Group {

    public static void main(String[] args) {
        int i = determineGroup(91);
        System.out.println(i);
    }

    public static int determineGroup(int age) {

        if (age > 6 && age < 14) {
            return 1;
        }
        if (age > 13 && age < 18) {
            return 2;
        }
        if (age > 17 && age < 66) {
            return 3;
        }
        return -1;
    }
}
