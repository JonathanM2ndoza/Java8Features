package com.jmendoza.stream;

import com.jmendoza.functionalinterfaces.model.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollector {
    public static void main(String[] args) {

        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet("Noche", 8));
        pets.add(new Pet("Amber", 3));
        pets.add(new Pet("Dia", 8));
        pets.add(new Pet("Kira", 5));
        pets.add(new Pet("Adidas", 3));
        pets.add(new Pet("Vagabundo", 9));

        Map<Integer, Long> counting = pets.stream()
                .collect(Collectors.groupingBy(Pet::getAge, Collectors.counting()));

        System.out.println("Collectors.groupingBy - counting: " + counting);

        Map<Integer, Integer> sum = pets.stream().collect(
                Collectors.groupingBy(Pet::getAge, Collectors.summingInt(Pet::getAge)));

        System.out.println("Collectors.groupingBy - summingInt: " + sum);

        Map<Integer, List<Pet>> groupByAgeMap =
                pets.stream().collect(
                        Collectors.groupingBy(Pet::getAge)
                );

        System.out.println("Collectors.groupingBy getAge: " + groupByAgeMap);

        Map<Integer, Set<String>> mapping =
                pets.stream().collect(
                        Collectors.groupingBy(Pet::getAge,
                                Collectors.mapping(Pet::getName, Collectors.toSet())
                        )
                );

        System.out.println("Collectors.groupingBy - mapping: " + mapping);

        Map<Boolean, List<Pet>> partitioned =
                pets.stream().collect(Collectors.partitioningBy(p -> p.getAge() > 5));

        System.out.println("Collectors.partitioningBy: " + partitioned);

        Map<Boolean, Map<Integer, Long>> partitioned2 =
                pets.stream().collect(
                        Collectors.partitioningBy(p -> p.getAge() > 5, Collectors.groupingBy(Pet::getAge, Collectors.counting()))

                );

        System.out.println("Collectors.partitioningBy and groupingBy: " + partitioned2);

        Map<Boolean, Map<Boolean, List<Pet>>> partitioned3 =
                pets.stream().collect(
                        Collectors.partitioningBy(p -> p.getAge() > 5, Collectors.partitioningBy(t -> t.getName().startsWith("N")))

                );

        System.out.println("Collectors.partitioningBy and partitioningBy: " + partitioned3);

        String string = pets.stream()
                .map(Pet::getName)
                .collect(Collectors.joining(", ", "(", ")"));

        System.out.println("Collectors.joining: " + string);
    }
}
