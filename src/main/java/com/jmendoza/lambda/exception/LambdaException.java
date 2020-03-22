package com.jmendoza.lambda.exception;

import java.util.function.BiConsumer;

public class LambdaException {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int key = 0;

        process(numbers, key, wrapperLambda((x, y) -> System.out.println(x / y)));
    }

    private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : numbers) {
            biConsumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
        return (x, y) -> {
            try {
                biConsumer.accept(x, y);
            } catch (ArithmeticException e) {
                System.out.println("Exception caught in wrapperLambda: " + e.toString());
            }
        };
    }
}
