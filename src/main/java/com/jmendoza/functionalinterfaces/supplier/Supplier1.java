package com.jmendoza.functionalinterfaces.supplier;

import com.jmendoza.functionalinterfaces.model.Pet;

import java.util.function.Supplier;

public class Supplier1 {
    public static void main(String[] args) {

        Supplier<Pet> supplier = () -> new Pet("Amber", 3);

        Pet pet = supplier.get();
        System.out.println(pet);
    }
}
