package jug.istanbul.lambda;

import java.util.function.Function;

public class Example11 {


    public static void run(Function<Integer, Integer> function, int value) {
        System.out.println(function.apply(value));
    }
    public static void main(String[] args) {


        Function<Integer, Integer> addFunc = e->e +10;
        Function<Integer, Integer>  multiplyFunc = f-> f * 10;

        run(multiplyFunc.andThen(addFunc), 100);
    }
}
