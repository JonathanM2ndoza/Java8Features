package com.jmendoza.functionalinterfaces.function;

import java.util.function.Function;

public class Function1 {
    public static void main(String[] args) {

        Function<Integer, Double> operation = x -> x / 3.0;
        operation = operation.compose(x -> 2 * x);

        System.out.println(operation.apply(4));
    }
}
