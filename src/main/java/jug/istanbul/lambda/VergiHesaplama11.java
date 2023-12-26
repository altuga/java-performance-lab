package jug.istanbul.lambda;


import java.math.BigDecimal;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.math.BigDecimal.valueOf;

class TaxPayer12 {

    Function<BigDecimal, BigDecimal> function;
    public TaxPayer12(Function<BigDecimal, BigDecimal>... taxVars) {

        function = e->e;
        //for (Function<BigDecimal, BigDecimal> taxvar : taxVars) {
         //   function = function.andThen(taxvar);
        //}

        function = Stream.of(taxVars).reduce(Function::andThen).orElse(e->e);

    }

    public void pay(BigDecimal tax){
        System.out.println(function.apply(tax));
    }

}
public class VergiHesaplama11 {


    /**
     * TaxPayer
     * Tax
     * Gov
     *  - tax , o günün şartlarında değiştirebilsin
     *      - Ör
     *          - 1000
     *              - %20 - ek bindirim
     *              - %10 - ek bindirim
     *              - %5 indirim
     *              - .....
     *              -> 1254 TL
     * - Değişen şeylerle, değişmeyen şeyleri ayıralım
     * @param args
     */
    public static void main(String[] args) {


        TaxPayer12 taxPayer12 = new TaxPayer12(
                tax -> tax.multiply(valueOf(1.20)),
                tax -> tax.multiply(valueOf(1.10)),
                tax -> tax.multiply((valueOf(0.95)))


        );

        taxPayer12.pay(valueOf(1000));
    }
}
