package jug.istanbul.lambda;

import java.util.function.Function;

public class Example06 {

    public static int execute(Function<Integer, Integer> function, int value) {
        return function.apply(value);
    }

    public static void main(String[] args) {

        Function<Integer, Integer> add = e-> e + 10;
        Function<Integer, Integer> multiply = e-> e * 10 ;

        int value = execute(add.andThen(multiply), 10);
        System.out.println(" value : "   + value);


    }
}
