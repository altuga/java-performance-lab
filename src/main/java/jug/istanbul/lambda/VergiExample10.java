package jug.istanbul.lambda;


import java.math.BigDecimal;
import java.util.function.Function;

import static java.math.BigDecimal.valueOf;

class TaxPayer10 {


    Function<BigDecimal, BigDecimal> functions;
    public TaxPayer10(Function<BigDecimal, BigDecimal>... taxrates) {
        functions = e->e;

        for (Function<BigDecimal, BigDecimal> taxrate: taxrates) {
            functions = functions.andThen(taxrate);
        }

    }

    public BigDecimal pay(BigDecimal tax) {
        return functions.apply(tax);
    }
}

public class VergiExample10 {


    /**
     *
     * TaxPayer
     * Tax
     * Goverment  --> Tax
     *  - TaxRates
     *  - Tax % 20  // bindirim
     *  - Tax % 10  // bindirim
     *  - Tax % -5  // indirim
     *
     *  Tax (vergi )  canlı ortamda, dinamik hesaplanmasını arzu ediyoruz, efdm
     */


    public static void main(String[] args) {
        TaxPayer10 taxPayer = new TaxPayer10(
                bigDecimal -> bigDecimal.multiply(valueOf(1.20)),
                bigDecimal -> bigDecimal.multiply(valueOf(1.10)),
                bigDecimal -> bigDecimal.multiply(valueOf(0.95))
                );

        BigDecimal result = taxPayer.pay(valueOf(1000));
        System.out.println(result);

    }
}
