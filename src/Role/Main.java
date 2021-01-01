package Role;

public class Main {

    public static String printText(String[] roles, String[] textLines) {
        StringBuilder answer = new StringBuilder();

        for (String role : roles) {
            answer.append(role + ":\n");

            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role + ":")) {
                    answer.append((i+1) + ")" + textLines[i].substring(role.length() + 1) + "\n");
                }
            }
            answer.append("\n");
        }
        return answer.toString();
    }


    static void printTextPerRole(String[] roles, String[] textLines) {
        // передача в метод роли и текста... успешно

        //System.out.println(roles.toString());

    }

    public static void main(String[] args) {
       // String roles = "мой дядя честный правил" +
     //   " когда не в шутку превозмог";

    //    String[] seasons  = new String[] {"Winter", "Spring", "Summer", "Autumn"};
   //     String[] role = new String[] {"Варвар", "Садист", "Трансформатор"};
   //     String[] textLine = new String[] {"Первый среди первых", "Вы умрёте", "Изменить реальность"};
         String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
         String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

    //    String text = "Варвар и глуши";

        String l = printText(roles, textLines);
        System.out.println(l);
    }
}
