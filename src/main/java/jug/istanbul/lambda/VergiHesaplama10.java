package jug.istanbul.lambda;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.math.BigDecimal.valueOf;

/**
 * TaxPayer
 * Gov
 * Tax
 * Tax zamanla degismesi
 *  - bindirimler
 *  - indirimler
 *  - 1000 TL
 *      - 1200 (%20) bindirim
 *      - 1320 (%10) bindirim
 *      - %5 - indirim
 *
 */


class TaxPayer11  {

    Function<BigDecimal, BigDecimal> function;
    public TaxPayer11(Function<BigDecimal, BigDecimal> ... taxRules) {
        function = e->e;

        //for (Function<BigDecimal, BigDecimal> tax:taxRules) {
        //    function = function.andThen(tax);
        //}

        function = Stream.of(taxRules).reduce(Function::andThen).orElse(e->e);
    }

    public void pay(BigDecimal tax) {
        // ödeme burada gerçekleşsin
        // ama kural setlerine göre
        System.out.println(function.apply(tax));
    }

}
public class VergiHesaplama10 {

    public static void main(String[] args) {
        TaxPayer11 taxPayer10 = new TaxPayer11(
                 tax -> tax.multiply(valueOf(1.20)), // 20 bindirim
                tax-> tax.multiply(valueOf(1.10)),// %10 bindirim
                tax->tax.multiply(valueOf(0.95)) // %5 indirim
        );
        taxPayer10.pay(valueOf(1000));
    }
}
