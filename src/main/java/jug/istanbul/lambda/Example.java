package jug.istanbul.lambda;

import java.util.function.Function;

/**
 * Decarator pattern
 */
public class Example {


    public static int process(Function<Integer, Integer> function) {
        return function.apply(5);
    }
    public static void main(String[] args) {
        Function<Integer, Integer> inc = e -> e + 1 ;
        Function<Integer, Integer> doubleIt = e-> e * 2 ;

        System.out.println(process(inc));
        System.out.println(process(doubleIt));

        System.out.println(process(inc.andThen(doubleIt)));
    }
}
