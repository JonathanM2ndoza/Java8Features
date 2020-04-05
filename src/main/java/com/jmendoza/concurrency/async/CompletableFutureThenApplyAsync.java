package com.jmendoza.concurrency.async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureThenApplyAsync {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            ExecutorService cpuBound = Executors.newFixedThreadPool(4);
            ExecutorService ioBound = Executors.newCachedThreadPool();

            CompletableFuture.supplyAsync(CompletableFutureThenApply::getOrder, ioBound)
                    .thenApplyAsync(CompletableFutureThenApply::enrich, cpuBound)
                    .thenApplyAsync(CompletableFutureThenApply::payment, ioBound)
                    .thenAcceptAsync(CompletableFutureThenApply::dispatch)
                    .thenRun(() -> {
                        System.out.println("shutdown: " + Thread.currentThread().getName());
                        cpuBound.shutdown();
                        ioBound.shutdown();
                    });
        }

        System.out.println("================== Not blocking Main Thread ==================");
    }
}
