package jug.istanbul.thread_dump;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFuturePDCA {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        CompletableFuture<Integer> cf1 =
                CompletableFuture.supplyAsync(() -> process(1), executorService);

        CompletableFuture<Integer> cf2 =
                CompletableFuture.supplyAsync(() -> {
                    throw new RuntimeException();
                }, executorService);


        CompletableFuture<Void> result = CompletableFuture.allOf(cf1, cf2);

        result.join();

        executorService.shutdown();
    }


    public static int process(int i) {

        try {
            Thread.sleep(1000000000);
            int value = i + 1;
            return value;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
