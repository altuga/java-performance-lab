package jug.istanbul.lambda;

import java.util.function.Function;

public class Example05 {

    public static int execute(Function<Integer, Integer> function, int value) {

        int result =  function.apply(value);
        return result;

    }

    public static void main(String[] args) {
        Function<Integer, Integer> addValue= e-> e+1;
        Function<Integer, Integer> multiplyFive= e-> e*5;

        System.out.println(execute(addValue, 10));
        System.out.println(execute(multiplyFive, 10));

        //Function<Integer, Integer> newFunction = addValue.andThen(multiplyFive);
        System.out.println(execute(addValue.andThen(multiplyFive), 10));


    }
}
