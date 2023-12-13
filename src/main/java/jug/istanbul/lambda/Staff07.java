package jug.istanbul.lambda;

import org.apache.commons.math3.primes.Primes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Staff07 {

    // Bir dizideki asal sayıları bulan fonksiyon isteniyor


    public static void findPrime(List<Integer> values, Predicate<Integer> selector) {

        for(int value : values ) {
            if (selector.test(value)) {
                System.out.println(value);
            }
        }
    }

    public static void findOddAndPrime(List<Integer> values) {

        for(int value : values ) {
            if (Primes.isPrime(value)) {
                if(value % 2 != 0) {
                    System.out.println(value);
                }

            }
        }
    }

    public static void findNonPrime(List<Integer> values) {

        for(int value : values ) {
            if (!Primes.isPrime(value)) {
                System.out.println(value);
            }
        }
    }

    public static void main(String[] args) {

        Random rand = new Random();

        // create an instance of the ArrayList class
        ArrayList<Integer> list = new ArrayList<Integer>();

        // test data generation generate random function
        for (int i = 0; i < 100; i++) {
            int randomNumber = rand.nextInt(1000) + 1;
            list.add(randomNumber);
        }

        // stratejiler
        Predicate<Integer> selector = e->Primes.isPrime(e);
        Predicate<Integer> selector2 = e->e%2 ==0;

        findPrime(list, selector.and(selector2) );
        //System.out.println("--findNonPrime--");
        //findNonPrime(list);
        //System.out.println("--findOddAndPrime--");
        //findOddAndPrime(list);


        // search for asal sayı
        // print out asal sayş
    }
}
