package jug.istanbul.dp;

import java.util.List;
import java.util.function.Predicate;

public class NumberOperation {

    /**
     * Strategy pattern
     *
     *
     */

    public static int sum(List<Integer> values,
                          Predicate<Integer> predicate) {
        int total = 0 ;
        for (int value : values) {
            if(predicate.test(value)) {
                total += value;
            }
        }
        return total;
    }



    public static void main(String[] args) {
        var numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(sum(numbers, e -> true));
        System.out.println(sum(numbers,  e-> e %2 == 0));
        System.out.println(sum(numbers,  e-> e %2 != 0));

    }
}
