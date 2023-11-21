package jug.istanbul.lambda;


import java.math.BigDecimal;
import java.util.function.Function;
import java.util.stream.Stream;



class Vergi {

    Function<BigDecimal, BigDecimal> filter;

    public Vergi(Function<BigDecimal, BigDecimal>... filters) {
        filter = input -> input;
        //for (Function<Color, Color> filterInner:filters) {
        //   filter = filter.andThen(filterInner);
        // }

        filter = Stream.of(filters).reduce(Function.identity(), Function::andThen);

    }

    public BigDecimal hesapla(BigDecimal input) {
        return filter.apply(input);
    }

}


public class VergiExample {

    public static void print(Vergi vergi) {
        BigDecimal ceza = vergi.hesapla(BigDecimal.valueOf(100));
        System.out.println(ceza.toString());
    }

    public static void main(String args[]) {

        print(new Vergi(ceza -> ceza.add(BigDecimal.valueOf(50))));

        print(new Vergi(ceza -> ceza.subtract(BigDecimal.valueOf(50))));

        print(new Vergi( ceza -> ceza.subtract(BigDecimal.valueOf(50)), BigDecimal::negate));

        //print(new Vergi(Ceza::ekle)) ;
        //print(new Vergi( BigDecimal::add, Ceza::azalt, Ceza::ekle));

        // CameraExample -> Camera -> Filter(Color)
        // TaxExample -> Vergi -> Filter(Ceza)

    }

}
