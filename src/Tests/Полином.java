package Tests;

public class Полином {

    public static boolean isPalindrome(String text) {
        String str = text.replaceAll("[^a-z^A-Z]", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(str);
        String text1 = stringBuilder.reverse().toString();
        return text1.equals(str);
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        //stringBuilder.reverse();
        String text = "Eva, Can I Stab Bats In A Cave?";

        System.out.println(isPalindrome(text));



    }
}
