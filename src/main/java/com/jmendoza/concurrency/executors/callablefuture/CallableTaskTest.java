package com.jmendoza.concurrency.executors.callablefuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableTaskTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future> futureList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Future<Integer> integerFuture = executorService.submit(new CallableTask());
            // Blocking Main Thread
            /*Integer result = integerFuture.get();
            System.out.println(result);*/
            futureList.add(integerFuture);
        }

        // Perform some unrelated operations

        // Try not to block Main Thread
        futureList.forEach(f -> {
            try {
                System.out.println("Result of future: " + f.get(1, TimeUnit.SECONDS));
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                System.out.println("Couldn't complete task before timeout: " + e.toString());
            }
        });
        executorService.shutdown();
    }
}
