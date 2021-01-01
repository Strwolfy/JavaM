package Стримы.задача;

//Определяем свой функциональный интерфейс

@FunctionalInterface
interface MyPredicate<T extends Number> {
    boolean test(T value);
}

public class Tester {
    //     MyPredicate myPredicate = x -> x > 0;
  //  public static <? extends Number> MyPredicate  get() { return  x -> (Number) (x > 0); }

    public static void main(String[] args) throws Exception {
        MyPredicate myPred;
    //    MyPredicate myPredicate = x ->
  //      System.out.println(myPredicate.test(10));
//true
    //    MyPredicate numGen = get();
    //    System.out.println(numGen.test(5));

        
//Аналогично, но используется встроенный функциональный интерфейс java.util.function.Predicate

   //     Predicate<Integer> predicate = x -> x > 0;
    //    System.out.println(predicate.test(-10));
//false

    }
}