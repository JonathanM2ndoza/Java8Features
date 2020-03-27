package com.jmendoza.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectionSet {
    public static void main(String[] args) {

        System.out.println("=================== Collection: Set =================");
        TreeSet<String> stringTreeSet = new TreeSet<>();
        System.out.println(stringTreeSet.add("Amber"));
        System.out.println(stringTreeSet.add("Noche"));
        System.out.println(stringTreeSet.add("Dia"));
        System.out.println(stringTreeSet.add("Kira"));
        System.out.println(stringTreeSet.add("Chiquita"));
        System.out.println("======================= Sort Ascending ===================");
        System.out.println(stringTreeSet);
        System.out.println("======================= Sort descending ==================");
        TreeSet<String> stringTreeSet2 = (TreeSet<String>) stringTreeSet.descendingSet();
        System.out.println(stringTreeSet2);

        System.out.println("======================= Filter ============================");
        System.out.println(stringTreeSet.stream().filter(x -> x.contains("Chiquita") || x.contains("Kira")).collect(Collectors.toList()));

        System.out.println("======================= addAll ============================");
        stringTreeSet.addAll(Arrays.asList("Pancho", "Lol"));
        System.out.println(stringTreeSet);

        System.out.println("======================= first ============================");
        System.out.println(stringTreeSet.first());

        System.out.println("======================= last ============================");
        System.out.println(stringTreeSet.last());

        System.out.println("======================= subSet ============================");
        System.out.println(stringTreeSet.subSet("Kira", "Pancho"));

        System.out.println("======================= headSet ============================");
        System.out.println(stringTreeSet.headSet("Dia", true));

        System.out.println("======================= tailSet ============================");
        System.out.println(stringTreeSet.tailSet("Dia"));

        System.out.println("======================= spliterator ============================");
        Spliterator<String> stringSpliterator = stringTreeSet.spliterator();
        stringSpliterator.forEachRemaining(System.out::println);
        System.out.println("======================= trySplit ============================");
        System.out.println(stringSpliterator.trySplit());

        System.out.println("======================= trySplit ============================");
        ArrayList<String> list = new ArrayList<>();
        list.add("HOUSE");
        list.add("CAR");
        list.add("APART");
        list.add("WINDOWS");
        list.add("TESLA");
        list.add("PH");

        Spliterator<String> spliterator1 = list.spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit();
        spliterator1.forEachRemaining(System.out::println);
        System.out.println("======================================");
        spliterator2.forEachRemaining(System.out::println);

    }
}
