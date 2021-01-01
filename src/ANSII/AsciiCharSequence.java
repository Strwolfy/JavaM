package ANSII;

class ANSII {

    public static class AsciiCharSequence implements CharSequence {
        private byte[] content;

        public AsciiCharSequence(byte[] content) {
            this.content = content;

        }

        @Override
        public int length() {
            return content.length;
        }

        @Override
        public char charAt(int index) {
            return (char) content[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            byte[] destArr = new byte[end - start];
            System.arraycopy(content, start, destArr, 0, destArr.length);
            return new AsciiCharSequence(destArr);
        }

        @Override
        public String toString() {
            //return Arrays.toString(content);
            return new String(content);
        }

        public static void main(String[] args) {
            char [] Arr = {'2', 'a', 'l', 'к'};

            byte[] example = {72, 101, 108, 108, 111, 33};
            AsciiCharSequence answer = new AsciiCharSequence(example);
            System.out.println("Последовательность - " + answer.toString());//Hello!
            System.out.println("Размер её - " + answer.length());//6
            System.out.println("Символ под № 1 - " + answer.charAt(1));//e
            System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
//проверка на нарушение инкапсуляции private поля
            System.out.println(answer.toString());//Hello!
            example[0] = 74;
            System.out.println(answer.toString());//Hello!


            String Str = "Welcome to geeksforgeeks";

            // prints the subsequence from 0-7, exclusive 7th index
            System.out.print("Returns: ");
            System.out.println(Str.subSequence(0, 7));

            System.out.print("Returns: ");
            System.out.println(Str.subSequence(10, 24));

            byte[] example1 = {72, 101, 108, 108, 111, 33};
            AsciiCharSequence sequence = new AsciiCharSequence(example1);
            System.out.println(sequence.toString());
            System.out.println(sequence.length());
            System.out.println(sequence.charAt(4));
            System.out.println(sequence.subSequence(1, 4));
            example[0] = 74;
            System.out.println(sequence.toString());
        }

    }
}