package jug.istanbul.lambda;

import java.util.List;
import java.util.function.Predicate;

public class Staff2 {

    public static int topla(List<Integer> values, Predicate<Integer> predicate) {
       int toplam = 0;
        for (int value: values ) {
           if (predicate.test(value))
                toplam += value;
        }
        return toplam;
    }



    public static void main(String[] args) {
        var numbers= List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(" Result : " + topla( numbers, e-> true ));
        System.out.println(" Result : " + topla( numbers, e-> e % 2 == 0));
        System.out.println(" Result : " + topla( numbers, e-> e % 2 != 0 ));


    }
}
