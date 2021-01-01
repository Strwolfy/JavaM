package Дженерикс.Box;

/* Лекция 6.1.1 рассказ о минЭлемент
*   1.2 Optional описание. Своя реализация это Optionals
*   1.3 Рассказывает о методах Оптионалс.
*   1.3 Про аннотации и String типы
*   1.4 Рассказывает об T в Optional
*   1.5 Empty, of, ofNullable, CharSequence, String
*   1.6 Рассказ об Optional Object;
*
*   2.1 Об коллекции - это дженерики, только ссылочный тип
*   2.2 Основные классы коллекций: LIST
*
*
* */


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

class Box<T> {
    private T object;

    public static void main(String[] args) {
        String text = "???";
        @Nullable String nullableText = null;

        Optional<String> baz = Optional.of("baz");
        baz.ifPresent(System.out::println);

        Optional<String> bar = Optional.empty();
        String value = bar.orElse("bar");

        @NotNull String nonNullText = "hello";
        String text1 = "bar";

        Optional<String> foo = Optional.empty();
        Optional<String> bar1 = Optional.of("bar");
        Optional<String> baz1 = Optional.ofNullable("bar");
        Optional<CharSequence> optionalCharSequence =
                Optional.<CharSequence>ofNullable("bar");

    //    Optional<String> newOptional = new Optional<String>("foobar");
    //  daimond operator

        //optionalText.ifPresent(System.out::println);
        //Optional<String> foo = Optional.
    }
}
