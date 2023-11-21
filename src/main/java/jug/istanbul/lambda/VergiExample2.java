package jug.istanbul.lambda;


import java.math.BigDecimal;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.math.BigDecimal.valueOf;

class Mukkellef {

    Function<BigDecimal, BigDecimal> function;
    public Mukkellef(Function<BigDecimal, BigDecimal>...  functions) {
        function = input -> input;
        // öncelikle tum fonksiyonları birleştiriyor
        for (Function<BigDecimal, BigDecimal> afunction :  functions) {
            this.function = function.andThen(afunction);
        }


    }

    public BigDecimal ode(BigDecimal tahakkuk) {
        // gelen vergi tutarını, ilgili fonksiyonlarda uygula
        return this.function.apply(tahakkuk);
    }

}
public class VergiExample2 {


    public static void tahakkukHesapla(Mukkellef mukkellef) {
        System.out.println(mukkellef.ode(valueOf(10)));
    }
    public static void main(String[] args) {
        // Mukkellefê %20 indirim TL KDV
        // Mukkellef %60 vergi
        // Mukkellef %50  ek verginin vergisi
        tahakkukHesapla(
                new Mukkellef(
                        bigDecimal -> bigDecimal.multiply(valueOf(0.80)),
                        bigDecimal -> bigDecimal.multiply(valueOf(1.60)),
                        bigDecimal -> bigDecimal.multiply(valueOf(1.50))

                    ));

    }
}
