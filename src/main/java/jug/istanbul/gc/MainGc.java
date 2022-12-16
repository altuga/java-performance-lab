package jug.istanbul.gc;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.math.BigDecimal;

public class MainGc {

    public static void main(String[] args) throws IOException {
        Customer customer = new Customer("Mehmet", "Arslan");
        Customer customer2 = customer;
        customer = new Customer("Ayse", "Arslan");
        // System.gc();// tetikleme

        Thread thread = new Thread();
        thread.setDaemon(false);
        thread.start();

        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            BigDecimal bigDecimal = BigDecimal.valueOf(i);
            new Integer("12");


            BigDecimal result = bigDecimal.subtract(BigDecimal.ONE);

        }

        BufferedInputStream reader = new BufferedInputStream(System.in);
        reader.read();

    }


}
