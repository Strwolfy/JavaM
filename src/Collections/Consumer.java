package Collections;

public interface Consumer<T> {
    void consume(T parameter);
}

class IntegerConsumer implements Consumer<Integer> {
    public void consume(Integer parameter) {}
}

class A<T>{

    private T t;

    public T get () {
        return t;
    }
    // универсальный метод
    public static <T> T returnType(T argument) {
        return argument;
    }
}