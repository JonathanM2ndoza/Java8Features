package com.jmendoza.stream;

import com.jmendoza.functionalinterfaces.model.Pet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {
    public static void main(String[] args) {

        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet("Noche", 8));
        pets.add(new Pet("Amber", 3));
        pets.add(new Pet("Dia", 7));
        pets.add(new Pet("Kira", 5));

        System.out.println("List pets before: " + pets);

        //Sort by String
        List<Pet> pets1 = pets.stream()
                .sorted(Comparator.comparing(Pet::getName))
                .collect(Collectors.toList());

        System.out.println("List pets after by Name: " + pets1);

        //Sort by int
        List<Pet> pets2 = pets.stream()
                .sorted(Comparator.comparingInt(Pet::getAge))
                .collect(Collectors.toList());

        System.out.println("List pets after by Age: " + pets2);

        //Sort by int and reversed
        List<Pet> pets3 = pets.stream()
                .sorted(Comparator.comparingInt(Pet::getAge).reversed())
                .collect(Collectors.toList());

        System.out.println("List pets after by Age - reversed: " + pets3);

        //Add Object with attribute null
        pets.add(new Pet(null, 5));

        //Sort by String and nullsLast
        List<Pet> pets4 = pets.stream()
                .sorted(Comparator.comparing(Pet::getName, Comparator.nullsLast(String::compareTo)))
                .collect(Collectors.toList());

        System.out.println("List pets after by Name - nullsLast: " + pets4);

    }
}