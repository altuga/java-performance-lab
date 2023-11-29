package jug.istanbul.lambda;

import java.util.List;
import java.util.function.Predicate;

public class Staff05 {


    public static int topla(List<Integer> integerList,  Predicate<Integer> selector) {

        int totalValue = 0 ;

        for (int value: integerList) {
            if(selector.test(value)) {
                totalValue += value;
            }
        }

        return totalValue;
    }





    public static void main(String[] args) {

        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,9,10);
        int totalValue = topla(integerList,  e-> true);
        System.out.println(" " + totalValue);

        // cift sayilari toplan - strategy pattern
        totalValue = topla(integerList,  e-> e%2==0);
        System.out.println(" " + totalValue);

        totalValue = topla(integerList,  e-> e%2!=0);
        System.out.println(" " + totalValue);

    }
}
