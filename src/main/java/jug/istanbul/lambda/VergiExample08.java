package jug.istanbul.lambda;


import java.math.BigDecimal;
import java.util.function.Function;

class TaxPayer09 {

    Function<BigDecimal, BigDecimal> function;

    /*
    add taxes as decarator
     */
    public TaxPayer09(Function<BigDecimal, BigDecimal>... taxes) {
        function = e->e;
        for (Function<BigDecimal, BigDecimal> tax: taxes) {
            function = function.andThen(tax);

        }
    }

    public void pay(BigDecimal taxValue) {
        System.out.println(function.apply(taxValue));

    }
}
public class VergiExample08 {


    // Tax payer
    // Tax is accurual  - 100 TL
    // decorate the tax (this part is dynamic)
        // add %20
        // add %10
        // increase -%5
    // pay the tax

    public static void main(String[] args) {


        TaxPayer09 osman =  new TaxPayer09(
                tax -> tax.multiply(BigDecimal.valueOf(1.20)),
                tax -> tax.multiply(BigDecimal.valueOf(1.10)),
                tax -> tax.multiply(BigDecimal.valueOf(0.95))
        );

        osman.pay(BigDecimal.valueOf(100));



    }
}
