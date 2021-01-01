package Animal;
public class Ruman {
    public static class Human {
        byte age;
        String name;
        String secondName;
        String favoriteSport;

        Human() {
        }

        public Human(byte age, String name, String secondName, String favoriteSport) {
            this.age = age;
            this.name = name;
            this.secondName = secondName;
            this.favoriteSport = favoriteSport;
        }

        public Human(byte age, String name, String secondName) {
            this.age = age;
            this.name = name;
            this.secondName = secondName;
        }
    }
    public static void main(String[] args) {
        Human Andrey = new Human();
        Human Alexey = new Human((byte) 25,"Алексей", "Петров", "футбол");
        Human Roman = new Human((byte) 35,"Роман", "Иванов");
    }
}