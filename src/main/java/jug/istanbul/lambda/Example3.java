package jug.istanbul.lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class Example3 {

    public static Integer calculate(Function<Integer,Integer> function, int value ){
        return  function.apply(value);
    }

    public static void main(String[] args) {
        Function<Integer, Integer> sumone =  value -> value +1 ;
        Function<Integer, Integer> multiply =  value -> value * 10 ;
        System.out.println(calculate(multiply.andThen(sumone), 100));
    }
}
