package jug.istanbul.lambda;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.function.Function;

class TaxPayer {

    Function<BigDecimal, BigDecimal> function;

    public TaxPayer(Function<BigDecimal, BigDecimal>... decarators) {
        function = e -> e;

        for (Function<BigDecimal, BigDecimal> decarator : decarators) {
            function = function.andThen(decarator);
        }
    }

    public void pay(BigDecimal taxValue) {
        BigDecimal paymentValue = function.apply(taxValue);
        System.out.println(paymentValue);
    }
}

public class VergiHesaplama09 {


    /**
     * TaxPayer
     * Must paid value
     * Goverment is gonna add or substract tax according to TaxPayer current condition on demand
     * increase %20
     * increase %10
     * decrease %5
     */

    public static void main(String[] args) {
        TaxPayer osman = new TaxPayer(
                tax -> tax.multiply(BigDecimal.valueOf(1.20)),
                tax -> tax.multiply(BigDecimal.valueOf(0.10)),
                tax -> tax.multiply(BigDecimal.valueOf(0.95))
        );
        osman.pay(BigDecimal.valueOf(100)); // orignal tax value
    }



}
