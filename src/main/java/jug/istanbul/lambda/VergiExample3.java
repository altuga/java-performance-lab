package jug.istanbul.lambda;


import java.math.BigDecimal;
import java.util.List;
import java.util.function.Function;

import static java.math.BigDecimal.valueOf;

/**
 *
 * 1-  Mukkelef bir vergi odeyecek
 * 2 - Odeyecek olan vergi değişiklik gösterebilir
 * 3 - Vergileri decore edeceğiz
 */

class Mukellef {

    Function<BigDecimal, BigDecimal> cezaMiktarlari;
    public Mukellef(Function<BigDecimal, BigDecimal>... vergilerCeza) {
        this.cezaMiktarlari = e-> e;
        for (Function<BigDecimal, BigDecimal> vergiCeza:vergilerCeza) {
            this.cezaMiktarlari = this.cezaMiktarlari.andThen(vergiCeza);
        }
    }

    public void tahakkukOde(BigDecimal vergi) {
        BigDecimal sonuc= cezaMiktarlari.apply(vergi);
        System.out.println(" tahakkuk Eden Ceza odendi " +  sonuc);
    }
}
public class VergiExample3 {


    public static void tahakkukEttir(Mukellef mukellef) {
        mukellef.tahakkukOde(valueOf(10));
    }

    public static void main(String[] args) {

        tahakkukEttir(
                new Mukellef(
                        e-> e.multiply(valueOf(0.80)),
                        e-> e.multiply(valueOf(1.60)) ,
                        e-> e.multiply(valueOf(1.10))
                ));



    }
}
