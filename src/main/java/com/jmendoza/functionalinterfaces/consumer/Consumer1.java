package com.jmendoza.functionalinterfaces.consumer;

import com.jmendoza.functionalinterfaces.model.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args) {

        List<Pet> pets = new ArrayList<Pet>();
        pets.add(new Pet("Noche", 8));
        pets.add(new Pet("Amber", 3));
        pets.add(new Pet("Dia", 7));

        Consumer<List<Pet>> consumer = petList -> petList.stream().forEach(x -> System.out.println(x));
        consumer.accept(pets);
    }
}
