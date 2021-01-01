package Tests;

public class Массив {

    public static int[] even(int number) {
        int[] i = new int[(number+1)/2];
        for(int o = 0; o < i.length; o++) {
            i[o] = 2*o+2;
            System.out.println(i[o]);
        }
        return i;
    }
    private String printTextPerRole(String[] roles, String[] textLines) {
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
    private static void mergeArrays(int[] a1, char[] a2) {
        StringBuilder answer = new StringBuilder();

        System.out.println("Строка первая " + a1.toString());
        System.out.println("Строка вторая " + a2);

      /*
        for (int role : a1) {
            answer.append(role + ":\n");
            for (int i = 0; i < a2.length; i++) {

                if (a2[i].startsWith(role + ":")) {
                    answer.append((i+1) + ")" + a2[i].substring(role.length() + 1) + "\n");
                }
            }
            answer.append("\n");
        }
        return answer;*/
    }
    //public mergeArrays

    public static int[] mergeArray(int[] a1, int[] a2) {
        int[] a3 = new int[a1.length + a2.length];
        int i = 0, j = 0;
        while (i < a1.length && j < a2.length){
            if (a1[i] < a2[j]) {
                a3[i + j] = a1[i];
                i++;
            } else {
                a3[i + j] = a2[j];
                j++;
            }
        }
        for (int k = i; k < a1.length; k++) {
            a3[j + k] = a1[k];
        }
        for (int k = j; k < a2.length; k++) {
            a3[i + k] = a2[k];
        }
        return a3;
    }

    public static void printOddNumbers(int[] arr) {
       StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 != 0) {
                buffer.append(arr[i] + ",");
            }
        }
        buffer.deleteCharAt(buffer.length()-1);
        System.out.println(buffer.toString());
    }

    public static  void main(String[] args) {
       // int[] ar = {3,5,20,8,7,3,100}; printOddNumbers(ar);
        mergeArrays(new int[]{'Р', 'd', 'e'}, new char[]{'u', 'e'});

    }
}