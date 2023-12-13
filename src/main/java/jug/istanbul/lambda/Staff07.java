package jug.istanbul.lambda;

import org.apache.commons.math3.primes.Primes;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Staff07 {

    // Bir dizideki asal sayıları bulan fonksiyon isteniyor


    public static void findPrime(Set<Integer> values, Predicate<Integer>... selectors) {

        Predicate<Integer> filter = Stream.of(selectors).reduce(Predicate::and).orElse(x->true);
        for(int value : values ) {

            if (filter.test(value)) {
                System.out.println(value);
            }
        }
    }

    public static void findOddAndPrime(Set<Integer> values) {

        for(int value : values ) {
            if (Primes.isPrime(value)) {
                if(value % 2 != 0) {
                    System.out.println(value);
                }

            }
        }
    }

    public static void findNonPrime(Set<Integer> values) {

        for(int value : values ) {
            if (!Primes.isPrime(value)) {
                System.out.println(value);
            }
        }
    }

    public static void main(String[] args) {

        Random rand = new Random();

        // create an instance of the ArrayList class
        Set<Integer> set = new TreeSet<Integer>();

        // test data generation generate random function
        for (int i = 0; i < 1000; i++) {
            int randomNumber = rand.nextInt(1000) + 1;
            set.add(randomNumber);
        }

        // stratejiler

        findPrime(set, e->Primes.isPrime(e),  e->e%2 !=0);
        //System.out.println("--findNonPrime--");
        //findNonPrime(list);
        //System.out.println("--findOddAndPrime--");
        //findOddAndPrime(list);


        // search for asal sayı
        // print out asal sayş
    }
}
