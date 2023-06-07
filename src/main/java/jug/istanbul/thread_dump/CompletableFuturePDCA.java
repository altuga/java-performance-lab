package jug.istanbul.thread_dump;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFuturePDCA {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        CompletableFuture<Integer> cf1 =
                CompletableFuture.supplyAsync(()
                                -> 42, executorService)
                        .thenApplyAsync(i ->
                        {
                            System.out.println(Thread.currentThread().getName());
                            return i + 1;
                        }, executorService)
                        .thenApply(i -> i + 1)
                        .thenApply(i -> i + 1);

        //CompletableFuture<Integer> cf2 =
        //        CompletableFuture.supplyAsync(() -> process2(1), executorService);


        // Hata durumuna Thread hemen hata veriyor.
        //CompletableFuture<List<Integer>> result =
        //        allOfShortcircuit(List.of(cf1, cf2));

        // Uzun süren Thread i bekliyor, kodu bekliyor
        //CompletableFuture<Void>  result = CompletableFuture.allOf(cf1, cf2);
        //result.join();
        //result.thenAccept(System.out::println).join();
        executorService.shutdown();
    }

    public static <T> CompletableFuture<List<T>> allOfShortcircuit(List<CompletableFuture<T>> cfs) {
        CompletableFuture result =
                CompletableFuture.allOf(cfs.toArray(new CompletableFuture[0]));

        for (CompletableFuture<T> cf : cfs) {
            cf.whenComplete((t, throwable) -> {
                if (throwable != null) {
                    result.completeExceptionally(throwable);
                }
            });
        }

        return result.thenApply(__ -> cfs.stream().map(CompletableFuture::join).collect((Collectors.toList())));
    }

    public static int process(int i) {

        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName());
            int value = i + 1;
            return value;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static int process2(int i) {

        try {
            Thread.sleep(10);
            System.out.println(Thread.currentThread().getName());
            int value = i + 1;
            return value;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
