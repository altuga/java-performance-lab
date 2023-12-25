package jug.istanbul.lambda;

import java.util.function.Function;

public class Example10 {


    public static void apply(Function<Integer, Integer> function, int value) {
        System.out.println( function.apply(value));
    }
    public static void main(String[] args) {


        Function<Integer, Integer> addFunction = e->e + 10;
        Function<Integer, Integer> multiplyFunction = e -> e * 10;


        apply(multiplyFunction.andThen(addFunction), 10);

    }
}
