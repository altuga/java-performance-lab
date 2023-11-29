package jug.istanbul.lambda;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Function;

import static java.math.BigDecimal.valueOf;


class Mukallef05 {

    Function<BigDecimal,BigDecimal> decoreEdilenVergiler;
    public Mukallef05(Function<BigDecimal, BigDecimal>... vergiler) {
        this.decoreEdilenVergiler = e-> e;
        for (Function<BigDecimal,BigDecimal> vergi :vergiler) {
            this.decoreEdilenVergiler = this.decoreEdilenVergiler.andThen(vergi);
        }

    }

    public void ode(BigDecimal tahakkukEdenMiktar) {
        BigDecimal odenenMiktar= decoreEdilenVergiler.apply(tahakkukEdenMiktar);
        System.out.println(" tahakkukEdenMiktar Odendi " + odenenMiktar );
    }
}


public class VergiHesaplama05 {

    public static void tahakkukEttir(Mukallef05 mukallef05) {
        mukallef05.ode(new BigDecimal(1000)); // Mukallefe 1000 TL vergi borcu olsun, 1344 TL
    }


    public static void main(String[] args) {
        /**
         *
         * Önce mukellef vergi cezalarına göre decore ediliyor
         * decore edilmiş Mukellef e vergi tahakkuk ediyor.
         * Mukellef tahakkuk eden vergiyi ödüyor
         *
         */

        tahakkukEttir(
                new Mukallef05(
                        vergi-> vergi.multiply(valueOf(1.40)) ,
                        vergi-> vergi.multiply(valueOf(1.20)),
                        vergi-> vergi.multiply(valueOf(0.80))));
    }
}
