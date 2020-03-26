package com.jmendoza.functionalinterfaces.predicate;

import com.jmendoza.functionalinterfaces.model.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicate2 {

    public List<Pet> process(List<Pet> pets, Predicate<Pet> predicate) {
        List<Pet> result = new ArrayList<>();
        for (Pet pet : pets)
            if (predicate.test(pet))
                result.add(pet);
        return result;
    }

    public static void main(String[] args) {

        Predicate2 predicate2 = new Predicate2();

        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet("Noche", 8));
        pets.add(new Pet("Amber", 3));
        pets.add(new Pet("Dia", 7));
        List<Pet> result = predicate2.process(pets, p -> p.getName().equals("Amber"));

        result.forEach(System.out::println);

    }
}
