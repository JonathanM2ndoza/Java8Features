package com.jmendoza.functionalinterfaces.bifunction;

import java.util.function.BiFunction;

public class BiFunction1 {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Double> operation = (x, y) -> (x + y) / 3.0;
        Double aDouble = operation.andThen(x -> 2 * x).apply(4, 2);

        System.out.println(aDouble);
    }
}
