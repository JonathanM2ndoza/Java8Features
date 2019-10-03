package com.jmendoza.functionalinterfaces.bifunction;

import com.jmendoza.functionalinterfaces.model.Pet;

import java.util.function.BiFunction;

public class BiFunction2 {
    public static void main(String[] args) {
        BiFunction<String, Integer, Pet> operation = (name, age) -> new Pet(name, age);
        System.out.println(operation.apply("Amber", 3));
    }
}