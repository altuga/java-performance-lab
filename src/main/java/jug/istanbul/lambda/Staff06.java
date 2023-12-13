package jug.istanbul.lambda;

import java.util.List;
import java.util.function.Predicate;

public class Staff06 {

    // list icerisindeki rakamları toplayan bir feature gelistir
    //Cuma 17:45 - 18:15


    public static int add(List<Integer> values, Predicate<Integer> selector) {

        int total = 0;
        for (int value : values) {
            if (selector.test(value)) {
                total += value;
            }
        }
        return total;
    }





    public static void main(String[] args) {
        System.out.println(add(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), e -> true));
        System.out.println(add(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), e -> e % 2 == 0));
        System.out.println(add(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), e -> e % 2 != 0));


        //parse("Elma; Armut; Cilek");

    }

}