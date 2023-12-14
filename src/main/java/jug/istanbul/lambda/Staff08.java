package jug.istanbul.lambda;

import org.apache.commons.math3.primes.Primes;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Staff08 {


    public static void findPrime(Set<Integer> set, Predicate<Integer>... predicates) {

        Predicate<Integer> function = Stream.of(predicates).reduce(Predicate::and).orElse(x->true);
        for (int value: set) {
            if(function.test(value)) {
                System.out.println("value prime " + value);
            }
        }
    }

    public static void findPrimeOdd(Set<Integer> set ) {

        for (int value: set) {
            if(Primes.isPrime(value)) {
                    if(value % 2 != 0) {
                        System.out.println("find Prime Odd " + value);
                    }
            }
        }
    }
    public static void findNonPrime(Set<Integer> set ) {

        for (int value: set) {
            if(!Primes.isPrime(value)) {
                System.out.println("value non-prime " + value);
            }
        }
    }
    public static void main(String[] args) {
        /**
         * Task is find the Prime Numbers in a random generated list
         * 19:00
         * 19:20
         */

        Set<Integer> set = new TreeSet<>();

        for (int i=0; i<1000; i++) {
            set.add(ThreadLocalRandom.current().nextInt(1000));
        }

        findPrime(set, e->Primes.isPrime(e), e->e%2==0);
        //findNonPrime(set);
        //findPrimeOdd(set);

    }
}
