package hash;

public class INt {
    public static void main(String[] args) {
        int varA = 2;
        int varB = 5;

        final int prime = 31;
        int result = 1;
        result = prime * result + varA;
        result = prime * result + varB;
        System.out.println("Результат:" + result);

        result = varA;
        result = 31 * result + varB;
        System.out.println("Результат:" + result);

    }
}
