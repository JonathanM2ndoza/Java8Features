package com.jmendoza.functionalinterfaces.biconsumer;

import com.jmendoza.functionalinterfaces.model.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumer2 {
    public static void main(String[] args) {

        List<Pet> pets1 = new ArrayList<>();
        pets1.add(new Pet("Chiquita", 12));
        pets1.add(new Pet("Amber", 3));

        List<Pet> pets2 = new ArrayList<>();
        pets2.add(new Pet("Chiquita", 12));
        pets2.add(new Pet("Amber", 3));

        BiConsumer<List<Pet>, List<Pet>> compare = (petList1, petList2) -> {

            if (petList1.size() != petList2.size()) {
                System.out.println("False");
            } else {
                for (int i = 0; i < petList1.size(); i++)
                    if (!petList1.get(i).getName().equals(petList2.get(i).getName())) {
                        System.out.println("False");
                        return;
                    }
                System.out.println("True");
            }
        };

        BiConsumer<List<Pet>, List<Pet>> display = (petList1, petList2) -> {
            petList1.stream().forEach(x -> System.out.println(x));
            System.out.println("================================");
            petList2.stream().forEach(x -> System.out.println(x));
        };

        compare.andThen(display).accept(pets1, pets2);

    }
}
