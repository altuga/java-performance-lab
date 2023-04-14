package jug.istanbul.thread_dump;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<String> future = executorService.submit(() -> {
            Thread.sleep(1000);
            return "Hello World";
        });

        try {
            System.out.println("Future is done? " + future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        // Blocking API
        // Limited exception handling
        // A future cant be manually completed
        // Multiple futures can't be combined
    }
}
