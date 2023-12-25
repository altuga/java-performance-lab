package jug.istanbul.lambda;

import org.apache.commons.math3.primes.Primes;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Staff10 {

    /**
     * 1 - Random liste olusun
     * 2 - Random liste içerisindeki değerlerden Prime number (asal sayı olanları bul)
     *
     * 17:01
     * 17:52
     */


    public static void findPrime(Set<Integer> theList, Predicate<Integer> ... predicates) {

        Predicate<Integer> theTotalPredicate = Stream.of(predicates).reduce(Predicate::and).orElse(e->true);
        for (int value: theList) {
            if(theTotalPredicate.test(value)) {
                System.out.println(" -> " + value);
            }
        }
    }

    public static void findPrimeRange(Set<Integer> theList) {

        for (int value: theList) {
            if(Primes.isPrime(value)) {
                if (value < 1000) {
                    System.out.println(" -> " + value);
                }
            }
        }
    }

    public static void findPrimeRangeUp(Set<Integer> theList) {

        for (int value: theList) {
            if(Primes.isPrime(value)) {
                if (value > 1000) {
                    System.out.println(" -> " + value);
                }
            }
        }
    }
    public static void main(String[] args) {

        // 1 - Random liste olusun
        Set set = new TreeSet();
        for (int i=0; i<100; i++) {
            set.add(ThreadLocalRandom.current().nextInt(0,10000));
        }

        findPrime(set,
                 prime -> Primes.isPrime(prime) ,
                 e-> e < 1000,
                 e -> e%2 ==0);
        //System.out.println(" ***** ");
        //findPrimeRange(set);
        //System.out.println("*****");
        //findPrimeRangeUp(set);

    }
}
