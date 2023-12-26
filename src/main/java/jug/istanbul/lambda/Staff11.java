package jug.istanbul.lambda;

import org.apache.commons.math3.primes.Primes;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Staff11 {

    /*  16:45 -> 18:00 - 19:00
        17:25 ->


      - 1 - Random liste oluştur
      - 2 - Prime number bul
      - 3 - Prime number ve 1000 aşağı olacak
      - 4 - Değişen şeylerle, değişmeyen şeyleri ayırma sanatı
         - İş kuralları değişken
            - Liste içerisindeki matamatiksel ifadeler
     */

    public static void findPrime(Set<Integer> set, Predicate<Integer>... predicates) {

        Predicate<Integer> totalPredicate = Stream.of(predicates).reduce(Predicate::and).orElse(e->true);

        for (Integer value:set) {
            if (totalPredicate.test(value)) {
                System.out.println(" -> " + value);
            }
        }

    }

    public static void findPrimeLessThs(Set<Integer> set) {

        for (Integer value:set) {
            if (Primes.isPrime(value)) {
                if (value< 1000) {
                    System.out.println(" -> " + value);
                }
            }
        }

    }

    public static void findPrimeLessLessThs(Set<Integer> set) {

        for (Integer value:set) {
            if (Primes.isPrime(value)) {
                if (value< 500) {
                    System.out.println(" -> " + value);
                }
            }
        }

    }

    public static void main(String[] args) {

        // 1 - Random liste oluştur

        Set set = new TreeSet();
        for (int i = 0; i < 1000; i++) {
            set.add(ThreadLocalRandom.current().nextInt(1,10000));
        }


        // 2 - Prime number bul
        findPrime(set ,  prime ->Primes.isPrime(prime),
                e-> e < 1000, e-> e % 2 != 0);

        // 3  - Prime number ve 1000 aşağı olacak
        //System.out.println("-----");
        //findPrimeLessThs(set);
        //System.out.println("-----");
        //findPrimeLessLessThs(set);
    }
}
