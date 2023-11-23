package jug.istanbul.lambda;

import java.util.function.Function;

public class Example4 {

    public  static void calculate(Function<Integer, Integer> function, int value) {
        System.out.println( function.apply(value));
    }

    public static void main(String[] args) {
        Function<Integer,Integer> topla = e -> e+1 ;
        Function<Integer,Integer> carp = e -> e * 2 ;

        calculate(topla.andThen(carp), 5);
    }
}
