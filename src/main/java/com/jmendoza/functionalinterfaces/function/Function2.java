package com.jmendoza.functionalinterfaces.function;

import com.jmendoza.functionalinterfaces.model.Pet;

import java.util.HashMap;
import java.util.function.Function;

public class Function2 {
    public static void main(String[] args) {

        Function<Pet, HashMap> operation = pet -> {
            HashMap hashMap = new HashMap();
            hashMap.put("name", pet.getName());
            hashMap.put("age", pet.getAge());

            return hashMap;
        };

        System.out.println(operation.apply(new Pet("Amber", 3)));
    }
}
