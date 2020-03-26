package com.jmendoza.collection;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Amber");
        map.put(2, "Noche");
        map.put(3, "Chiquita");
        map.put(4, "Kira");
        map.put(5, "Dia");

        System.out.println("=================== Collection: Map =================");
        System.out.println("=================== getOrDefault ====================");
        System.out.println(map.getOrDefault(2, "Thor"));
        System.out.println(map.getOrDefault(5, "Thor"));

        System.out.println("=================== forEach =========================");
        map.forEach((k, v) -> System.out.println(k + "\t" + v));

        System.out.println("=================== keySet, values, entrySet ========");
        Set<Integer> keys = map.keySet();
        Collection<String> values = map.values();
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        System.out.println("Map: " + map);
        System.out.println("keys of Map : " + keys);
        System.out.println("values from Map :" + values);
        System.out.println("entries from Map :" + entries);

        System.out.println("=================== entrySet, stream, filter ========");
        final Map<Integer, String> collect = map.entrySet()
                .stream()
                .filter(x -> x.getKey() == 3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(collect);

        System.out.println("=================== replaceAll ======================");
        Map<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("key1", 1);
        map1.put("key2", 2);
        map1.put("key3", 3);
        map1.put("key4", 4);
        map1.replaceAll((key, oldValue) -> oldValue * oldValue);
        System.out.println("Before: " + map1);
        System.out.println("After: " + map1);

        System.out.println("=================== putIfAbsent ======================");
        map1.putIfAbsent("key5", 5);
        System.out.println(map1.get("key5"));
        map1.putIfAbsent("key2", 6);
        System.out.println(map1.get("key2"));
        System.out.println(map1);

        System.out.println("=================== remove ======================");
        map.remove(5);
        System.out.println(map);

        System.out.println("=================== compute ======================");
        map.compute(1, (k, v) -> v.concat(" Mendoza"));
        map.compute(2, (k, v) -> v.concat(" Gil"));
        map.compute(7, (k, v) -> null);
        map.compute(10, (k, v) -> "Angel");
        System.out.println(map);


    }
}
