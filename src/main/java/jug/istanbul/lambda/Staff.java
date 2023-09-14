package jug.istanbul.lambda;

import java.util.List;
import java.util.function.Predicate;

// Strategy pattern
public class Staff {



    public static int calculateTotal(List<Integer> values, Predicate<Integer> selector) {
        var result = 0;
        for (var e : values) {
            if (selector.test(e) ) {
                result += e;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(calculateTotal(numbers, e -> true));
        System.out.println(calculateTotal(numbers, e -> e % 2 ==0 ));
        System.out.println(calculateTotal(numbers, e -> e % 2 !=0 ));
    }
}
