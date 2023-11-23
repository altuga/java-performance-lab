package jug.istanbul.lambda;


import java.math.BigDecimal;
import java.util.function.Function;

import static java.math.BigDecimal.valueOf;

class Mukellef4 {

    Function<BigDecimal, BigDecimal> function;
    public Mukellef4(Function<BigDecimal,BigDecimal>... functions ) {
        function = e-> e;
        for (Function<BigDecimal, BigDecimal> function: functions) {
            this.function = this.function.andThen(function);
        }
    }

    public BigDecimal tahakkukEttir(BigDecimal odenecekVergi){
        BigDecimal tahakkukEdenVergi = this.function.apply(odenecekVergi);
        return tahakkukEdenVergi;
    }
}


public class VergiExample4 {


    public static void hesapla(Mukellef4 mukellef4, BigDecimal odenecekVergi) {
        System.out.println(mukellef4.tahakkukEttir(odenecekVergi));
    }
    public static void main(String[] args) {
        /**
         * Ödenmesi gereken bir takakkuk edecek vergi var - 100
         * Decarators
             * %80 x verginin vergisi , 1,80
             * %20 y verginin vergisi , 1,80
             * -%20 z  indirim vergisi , 0,80 (-20)
         * Ödenmesi gereken veregiyi dekore edeceğiz
         */

        hesapla(
                new Mukellef4(
                bigDecimal -> bigDecimal.multiply(valueOf(1.80)),
                bigDecimal -> bigDecimal.multiply(valueOf(1.20)),
                bigDecimal -> bigDecimal.multiply(valueOf(0.80))
        ), valueOf(10));

    }
}
