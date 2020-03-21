package com.jmendoza.functionalinterfaces.consumer;

import com.jmendoza.functionalinterfaces.model.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer2 {

    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<Pet>();
        pets.add(new Pet("Noche", 8));
        pets.add(new Pet("Amber", 3));
        pets.add(new Pet("Dia", 7));

        Consumer<List<Pet>> update = petList -> petList.add(new Pet("Vagabundo", 5));

        Consumer<List<Pet>> display = petList -> petList.stream().forEach(x -> System.out.println(x));

        update.andThen(display).accept(pets);

        System.out.println("===============Invoke the print method===============");

        print(pets, x -> System.out.println(x));
    }

    private static void print(List<Pet> petList, Consumer<Pet> consumer){
        for (Pet pet: petList ){
            consumer.accept(pet);
        }
    }
}
