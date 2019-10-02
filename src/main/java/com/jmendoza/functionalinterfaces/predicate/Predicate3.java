package com.jmendoza.functionalinterfaces.predicate;

import com.jmendoza.functionalinterfaces.model.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Predicate3 {
    public static void main(String[] args) {

        List<Pet> pets = new ArrayList<Pet>();
        pets.add(new Pet("Noche", 3));
        pets.add(new Pet("Amber", 8));
        pets.add(new Pet("Dia", 7));

        List<Pet> result = pets.stream()
                .filter((pet) -> pet.getName().equals("Amber"))
                .collect(Collectors.toList());

        result.forEach(x -> System.out.println(x.getName()));
    }
}
