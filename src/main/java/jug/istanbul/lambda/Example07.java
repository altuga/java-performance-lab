package jug.istanbul.lambda;

import java.util.function.Function;

public class Example07 {

    public static int execute(Function<Integer, Integer> function, int value) {
        return function.apply(value);
    }

    public static void main(String[] args) {
        // toplama
        Function<Integer, Integer> toplamaFunction = e->e+10;

        Function<Integer, Integer> carpmaFunction = e->e*100;
        int result = execute(toplamaFunction.andThen(carpmaFunction), 10);
        System.out.println(result);


        // carpma
    }
}
