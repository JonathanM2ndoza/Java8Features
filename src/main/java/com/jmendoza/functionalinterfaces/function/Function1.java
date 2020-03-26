package com.jmendoza.functionalinterfaces.function;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

public class Function1 {
    public static void main(String[] args) {

        //First option
        IntToDoubleFunction intToDoubleFunction = x -> (x / 3.0) * 2;
        System.out.println(intToDoubleFunction.applyAsDouble(4));

        //Second option
        Function<Integer, Double> operation = x -> x / 3.0;
        operation = operation.compose(x -> 2 * x);
        System.out.println(operation.apply(4));


    }
}
