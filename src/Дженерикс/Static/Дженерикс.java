package Дженерикс.Static;

class Дженерикс<O> {
    private O переменная;
    //private I l;
    public static <O> Дженерикс <O> get() {
        return new Дженерикс<>();
    }
    // 528
}
