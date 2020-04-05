package com.jmendoza.concurrency.async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureThenCombine {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Double> pi = CompletableFuture.supplyAsync(() -> Math.PI);
        CompletableFuture<Double> radius = CompletableFuture.supplyAsync(() -> Double.valueOf(34));

        CompletableFuture<Double> result = pi.thenCombine(radius, CompletableFutureThenCombine::calculateAreaCircle);

        System.out.println("Result Area Circle: " + result.get());
    }

    public static Double calculateAreaCircle(Double pi, Double radius) {
        System.out.println("Pi: " + pi + " Radius: " + radius);
        return pi * radius * radius;
    }
}
