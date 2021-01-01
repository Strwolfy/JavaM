package djenerics;

public class Cat {
    private String name;
    private String имя = "Слово";
    private Cat cot; // Это просто ссылка на новый объект
    //private Cat co;
    private Cat ca;
    private Cat c = new Cat();

    private void vnutr () { c.имя = "Кот"; }
    public String getИмя() { return имя; }              // Геттер
    public void setИмя(String имя) { this.имя = имя; } // Сеттер
    Cat() { this.имя = имя; } // конструктор
    void newCat() {          // создание кота по ссылке
        cot = new Cat();    // создание объекта
    }
    void newCo(Cat co) {  //
        co = new Cat();  // то есть мы не создаём переменную
    }
    // но можно по другому, можем возвращать тип класса
    // Cat кот; // так это просто ссылка
    Cat кот() {     // так можно создать метод "типа" класса кот
        return cot;
    }
    Cat котэ(Cat котэ) { return котэ; }  // Кот принимает и возвращает себя
    // Cat cat() { return cat; }
    Cat create () { return new Cat(); } // можно создавать новый экземляр класса

    private String имя0;
    private String фамилия;
    Cat link; // ссылка на кота
    int count = 0; // допустим мы создали счётчик
    Cat (Cat link) {
        link = new Cat();
        link.имя = "link";
    }
    public String getИмя1() { return имя; }
    Cat create3(Cat c) { return c; }
    void create1() {
        Cat cat = new Cat();
        cat.имя = "cat";
    }
}
