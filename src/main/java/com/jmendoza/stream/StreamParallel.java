package com.jmendoza.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamParallel {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        long count = Stream.iterate(0, n -> n + 1)
                .limit(1000000)
                .parallel()
                .filter(StreamParallel::isPrime)
                .count();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to complete: " + (endTime - currentTime) / (1000 * 60) + " minutes");

        System.out.println("Total: " + count);

    }

    private static boolean isPrime(Integer number) {
        if (number <= 1) return false;
        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }
}
