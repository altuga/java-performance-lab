package jug.istanbul.lambda;

import java.util.function.Function;

public class Example08 {

    public static int apply(Function<Integer, Integer> function, int value) {
        return  function.apply(value);
    }

    public static void main(String[] args) {
        /**
         * Write a 2 functions and show them how to use
         *
         */

        Function<Integer,Integer> addFunction = e->e+10;
        Function<Integer, Integer>  multiplyFunction= e->e*100;

        System.out.println( apply(addFunction.andThen(multiplyFunction), 10));
    }
}
