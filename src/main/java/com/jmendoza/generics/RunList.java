package com.jmendoza.generics;

public class RunList {
    public static void main(String[] args) {

        CustomList<String> stringCustomList = new CustomList<>();
        stringCustomList.add("Element 1");
        stringCustomList.add("Element 2");
        System.out.println(stringCustomList);

        CustomList<Integer> integerCustomList = new CustomList<>();
        integerCustomList.add(8);
        integerCustomList.add(4);
        System.out.println(integerCustomList);
    }
}
