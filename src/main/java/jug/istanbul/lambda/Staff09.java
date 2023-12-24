package jug.istanbul.lambda;

import org.apache.commons.math3.primes.Primes;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class Staff09 {


    public static void findPrime(Set<Integer> theUniqCase) {

        for (int value :theUniqCase) {
            if (Primes.isPrime(value)) {
                System.out.println(value);
            }
        }
    }

    public static void findOddPrime(Set<Integer> theUniqCase) {

        for (int value :theUniqCase) {
            if (Primes.isPrime(value)) {
                if(value % 2 != 0 ) {
                    System.out.println(value);
                }
            }
        }
    }

    public static void findEvenPrime(Set<Integer> theUniqCase) {

        for (int value :theUniqCase) {
            if (Primes.isPrime(value)) {
                if(value % 2 == 0 ) {
                    System.out.println(value);
                }
            }
        }
    }

    /**
     * Rastege üretilen sayılar olsun -  API gelen
     * Hangi sayılar Prime number olduğunu bulan
     * 17:38
     *
     * 17:48
     *
     * 17:55
     */


    public static void main(String[] args) {

        // Rastege üretilen sayılar olsun -  API gelmiş olsun


        Set theUniqList = new TreeSet();
        for (int i = 0; i < 1000; i++) {
            theUniqList.add(ThreadLocalRandom.current().nextInt(0, 10000));
        }

        findPrime(theUniqList);
        System.out.println("-----");
        findOddPrime(theUniqList);
        System.out.println("-----");
        findEvenPrime(theUniqList);

    }
}
