package Дженерикс.Box;

import java.util.NoSuchElementException;
import java.util.Objects;

public class Optionals<T> {

    private final T value;

    public Optionals(T value) {
        this.value = Objects.requireNonNull(value);
    }
    public static <T> Optionals<T> of (T value) {
        return new Optionals<>(value);
    }

    public T getValue() {
        if (value == null) {
            throw new NoSuchElementException("No value");
        }
        return value;
    }
}
class Option {
    private final Objects value;

    Option(Objects value) {
        this.value = Objects.requireNonNull(value);
    }
    public static Option of(Object value) {
        return new Option((Objects) value);
    }
    public Object get() {
        if (value == null) {
            throw new NoSuchElementException("No value present");
        }
        return value;
    }
}