package Дженерикс.Box;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.*;

public class Ops {
    

    

    public static <ComplexNumber> void main(String[] args) {
        Number number = new Integer(1);
        Number[] numbersArray = new Integer[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //numbersArray[0] = new BigDecimal(4);
        // можно

        Optional<Integer> optionalInt = Optional.of(1);
    //  Optional<Number> optionalNumber = optionalInt;  // нельзя

        //optionalNumber.set(new BigDecimal("3.14"));

        Collection<ComplexNumber> c ;
        //c.add(new ComplexNumber(1,2));

        //Iterator<Integer> it = collection.

        List<String> list1 = new ArrayList<>();
        List<Integer> list2 =  new LinkedList<>();



    }
}
