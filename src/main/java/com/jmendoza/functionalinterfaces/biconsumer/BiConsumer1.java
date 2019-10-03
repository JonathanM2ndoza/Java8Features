package com.jmendoza.functionalinterfaces.biconsumer;

import com.jmendoza.functionalinterfaces.model.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumer1 {
    public static void main(String[] args) {

        List<Pet> pets1 = new ArrayList<>();
        pets1.add(new Pet("Noche", 8));
        pets1.add(new Pet("Amber", 3));
        pets1.add(new Pet("Dia", 7));

        List<Pet> pets2 = new ArrayList<>();
        pets2.add(new Pet("Chiquita", 12));
        pets2.add(new Pet("Gaviota", 10));

        BiConsumer<List<Pet>, List<Pet>> consumer = (petList1, petList2) -> {
            petList1.stream().forEach(x -> System.out.println(x));
            System.out.println("================================");
            petList2.stream().forEach(x -> System.out.println(x));
        };

        consumer.accept(pets1, pets2);
    }
}
