package jug.istanbul.lambda;

import java.util.List;
import java.util.function.Predicate;

public class Staff3 {


    public static int topla(List<Integer> integerList, Predicate<Integer> predicate) {
        int toplam = 0 ;
        for (int value:integerList) {
            if (predicate.test(value) ) {
                toplam += value;
            }
        }
        return toplam;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(topla(list, e-> true));
        System.out.println(topla(list, e-> e % 2 == 0));
        System.out.println(topla(list, e-> e % 2 != 0));



    }
}
