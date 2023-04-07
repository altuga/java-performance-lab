package jug.istanbul.okr.chapter08;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class VirtualThreadExample {

    public static void main(String[] args) throws InterruptedException {
        //ThreadFactory customThreadFactory = Thread.builder().virtual().factory();
        ExecutorService executor = null; //Executors.newVirtualThreadExecutor(customThreadFactory);
        executor.submit(() -> {
            System.out.println("Hello from virtual thread!");
        });
        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);
    }

}


