package jug.istanbul.lambda;

import java.util.function.Function;

public class Example2 {


    public static void print(Function<Integer, Integer> func, int value) {
        System.out.println(func.apply(value));
    }
    public static void main(String[] args) {
        Function<Integer, Integer> function1 = e-> e + 1 ;
        Function<Integer, Integer> function2 = e-> e * 2 ;

        print(function1.andThen(function2), 10);

    }
}
