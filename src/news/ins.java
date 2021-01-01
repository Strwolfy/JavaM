package news;

import java.util.Arrays;

public class ins {

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder answer = new StringBuilder();

        for (String role : roles) {
            answer.append(role).append(":\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role + ":")) {
                    answer.append(i+1).append(")").
                            append(textLines[i].substring(role.length() + 1)).append("\n");
                }
            }
            answer.append("\n");
        }
        return answer.toString();
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder build = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] %2) != 0) {
                build.append(arr[i] + ",");
            }
        }
        build.deleteCharAt(build.length() - 1);
        System.out.println(build.toString());
    }


    public static void main(String[] args) {
        String [] roles= {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};

        String [] textLines={
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(roles, textLines));
    }
}
