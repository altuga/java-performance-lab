package jug.istanbul.lambda;


import java.math.BigDecimal;
import java.util.function.Function;

class TaxPayer {

    Function<BigDecimal, BigDecimal> function;

    /*
    add taxes as decarator
     */
    public TaxPayer(Function<BigDecimal, BigDecimal>... taxes) {
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



    }
}
