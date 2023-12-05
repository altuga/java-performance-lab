package jug.istanbul.lambda;


import java.math.BigDecimal;
import java.util.List;
import java.util.function.Function;

import static java.math.BigDecimal.valueOf;

class Mukellef06 {

    Function<BigDecimal, BigDecimal> toplamVergiler;

    public Mukellef06(Function<BigDecimal, BigDecimal>... vergiler) {
        toplamVergiler = e -> e;
        for (Function<BigDecimal, BigDecimal> vergi : vergiler) {
            toplamVergiler = toplamVergiler.andThen(vergi);
        }

    }

    public BigDecimal tahakkukEdenVergi(BigDecimal anaborc) {
        BigDecimal toplamBorc = toplamVergiler.apply(anaborc);
        System.out.println(" toplam borc " +  toplamBorc);
        return toplamBorc;
    }

}

public class VergiEsample06 {

    // Mukkellef vergi borcu var
    // vergi borcu
    // vergi borcu farklı sebeplerden dolayı dekore edilme ihtiyacı var

    public static void pay(Mukellef06 mukellef06) {
        System.out.println(mukellef06.tahakkukEdenVergi(valueOf(100)));
    }

    public static void main(String[] args) {
        pay(new Mukellef06(
                vergi -> vergi.multiply(valueOf(1.10)), // bindirim
                vergi -> vergi.multiply(valueOf(1.50)), // bindirim ++
                vergi -> vergi.multiply(valueOf(0.95))   // indirim %5
        ));
    }
}
