package jug.istanbul.thread_dump;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

public class CompletableFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(10);
        java.util.concurrent.CompletableFuture<Integer> completableFuture = java.util.concurrent.CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 1;
        }, executorService);

        completableFuture = completableFuture.thenApply(f -> f + 1); //.thenAccept(System.out::println);
        Integer value = completableFuture.get();
        System.out.println(value);



    }
}
