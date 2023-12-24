package jug.istanbul.lambda;

import java.util.function.Function;

public class Example09 {



    public static void apply(Function<Integer, Integer> theFunc, int value) {
        System.out.println( theFunc.apply(value));
    }
    public static void main(String[] args) {


        Function<Integer, Integer>  addingFunc = e -> e+100;

        Function<Integer, Integer>  multiplyFunc = e -> e*10;

        apply(addingFunc.andThen(multiplyFunc), 18) ;
    }
}
