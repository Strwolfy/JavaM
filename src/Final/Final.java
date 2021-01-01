package Final;
// определение класса - можно

public  class Final {
    final int message = 4; // четыре
    static int s;
    final static int constant = 5;

    final void method() {
        // в определении метода - два
    }
    final void metod(final int a) {
        // в определении переменных методов - три
    }
    //final hash.BlackBox.Final() {}
        /*hash.BlackBox.Final() {
            final int b = 5;
            // в конструкторе - пять
        }*/

    void  met () {
        final int i = 4;
        // локальные - пять
        for ( int l = 0; l < 5 ; l++) {
            final double s = 33; // можно
        }
    }

}
