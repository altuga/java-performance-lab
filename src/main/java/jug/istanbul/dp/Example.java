package jug.istanbul.dp;

import java.util.List;
import java.util.function.Predicate;

public class Example {

    public static int sum(List<Integer> values,
                          Predicate<Integer> predicate) {

        int total = 0 ;
        for(int e: values){
            if (predicate.test(e)) {
                total += e ;
            }

        }
        return total;

    }
    public static void main(String[] args) {

        var numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(sum(numbers, e-> true));
        System.out.println(sum(numbers, e-> e% 2 == 0));
        System.out.println(sum(numbers, e-> false));
    }
}
