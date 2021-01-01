package Animal;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.makeSound();
        cat.eat();
        String o;
        Object o1 = new Object();
     //   Animal animal = new Animal();
        /*{
            @Override
            public void eat() {
                super.eat();
            }
        }*/

        for (DayOfWeek day : DayOfWeek.values()) {

            System.out.println(
                    day.ordinal() + 1 + " " + day.name()
            );
        }
    }
}
