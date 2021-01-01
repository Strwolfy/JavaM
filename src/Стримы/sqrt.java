package Стримы;

import java.util.function.UnaryOperator;



interface NumberGenerator<T extends Number> {
    boolean cond(T arg);
}
interface MyPredicate {
    boolean test(Integer value);
}

public class sqrt<T> {

    private NumberGenerator<Number> numberNumberGenerator;

    public static UnaryOperator<Integer> sqrt() {
        return x -> x * x;
    }
   /*
    public void function() {
        return (T) (value > 0);
    }*/

  //  public static NumberGenerator<? super Number> getGenerator() { return  numberNumberGenerator; }
        // Operator '>' cannot be applied to 'java.lang.Number', 'int'


    public static void main(String[] args) {

        Стримы.задача.MyPredicate myPredicate = x -> x > 0;
        System.out.println(myPredicate.test(10));

        UnaryOperator unaryOperator = sqrt.sqrt();
        UnaryOperator<Integer> square = x -> x*x;
        System.out.println("2 -> " +  unaryOperator.apply(2));

   //     NumberGenerator<? super Number> numGen = getGenerator();
    //    System.out.println(numGen.cond(123456.56));

    //    NumberGenerator<? super Number> numGen = getGenerator();
    //    System.out.println(numGen.cond(123456L));
    }


}
