package jug.istanbul.lambda;


import java.util.List;
import java.util.function.Predicate;

public class Staff4 {


    public static int topla4(List<Integer> sayilar, Predicate<Integer> selector) {
        int toplam = 0;

        for (int sayi : sayilar) {
            if (selector.test(sayi)) {
                toplam += sayi;
            }
        }

        return toplam;
    }

    public static void main(String[] args) {
        // 1,10 arasındaki sayıları toplayalım
        int toplam = topla4(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), e-> true);
        System.out.println("Toplam " + toplam);

        toplam = topla4(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), e-> e % 2 == 0 );
        System.out.println("Toplam " + toplam);

        toplam = topla4(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), e-> e % 2 != 0 );
        System.out.println("Toplam " + toplam);
    }


}
