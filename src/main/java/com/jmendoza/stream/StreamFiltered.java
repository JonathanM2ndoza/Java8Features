package com.jmendoza.stream;

import com.jmendoza.functionalinterfaces.model.Pet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamFiltered {
    public static void main(String[] args) {

        List<Pet> pets = new ArrayList<Pet>();
        pets.add(new Pet("Noche", 8));
        pets.add(new Pet("Amber", 3));
        pets.add(new Pet("Dia", 7));
        pets.add(new Pet("Kira", 5));
        pets.add(new Pet("Adidas", 12));

        System.out.println("List pets before: " + pets);

        List<Pet> pets1 = pets.stream()
                .filter(p -> p.getAge() < 6)
                .sorted(Comparator.comparingInt(Pet::getAge))
                .collect(Collectors.toList());
        System.out.println("List pets after filter by age: " + pets1);

        List<Pet> pets2 = pets.stream()
                .filter(p -> p.getName().startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("List pets after filter by name: " + pets2);

        List<String> stringList = pets.stream()
                .filter(p -> p.getAge() < 6)
                .map(Pet::getName)
                .collect(Collectors.toList());

        System.out.println("stringList filter by age, map name: " + stringList);

        pets.add(new Pet("Dia", 7));
        System.out.println("Add duplicate pet: " + pets);

        //Remove duplicate object
        TreeSet<Pet> pets3 = pets.stream()
                .filter(p -> p.getAge() < 8)
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Pet::getName))));

        System.out.println("List pets - remove duplicate object: " + pets3);
    }
}
