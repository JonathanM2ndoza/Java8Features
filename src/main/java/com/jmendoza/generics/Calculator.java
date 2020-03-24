package com.jmendoza.generics;

import java.util.Collection;
import java.util.function.BinaryOperator;

public interface Calculator {

    static <E extends Number> E add(Collection<E> collection, BinaryOperator<E> binaryOperator) {
        return collection.stream().reduce(binaryOperator).orElse(null);
    }
}
