package com.jmendoza.functionalinterfaces.predicate;

import com.jmendoza.functionalinterfaces.model.Pet;

import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {

        Predicate<Pet> greaterThan = pet -> pet.getAge() > 4;
        Predicate<Pet> lowerThan = pet -> pet.getAge() < 10;

        boolean result = greaterThan.and(lowerThan).test(new Pet("Amber", 5));
        System.out.println(result);
    }
}
