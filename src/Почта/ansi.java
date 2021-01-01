package Почта;

import java.util.stream.IntStream;

class ansii implements CharSequence {

    private byte[] content;

    public ansii(byte[] content) {
        this.content = content;

    }
    @Override
    public int length() {
        return content.length;
    }

    @Override
    public char charAt(int index) {
        return (char)content[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] destArr = new byte[end - start];
        System.arraycopy(content, start, destArr, 0, destArr.length);
        return new ansii(destArr);
    }

    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        ansii answer = new ansii(example);
        System.out.println("Последовательность - " +  answer.toString());//Hello!
        System.out.println("Размер её - " +  answer.length());//6
        System.out.println("Символ под № 1 - " +  answer.charAt(1));//e
        System.out.println("Подпоследовательность - " +  answer.subSequence(1, 5));//ello

        //проверка на нарушение инкапсуляции private поля
        System.out.println(answer.toString());//Hello!
        example[0] = 74;
        System.out.println(answer.toString());//Hello!
    }
}
