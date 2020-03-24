package com.jmendoza.generics;

/**
 * E – Element (used extensively by the Java Collections Framework, for example ArrayList, Set etc.)
 * K – Key (Used in Map)
 * V – Value (Used in Map)
 * N – Number
 * T – Type
 * S,U,V etc. – 2nd, 3rd, 4th types
 */
public class GenericRunner {
    public static void main(String[] args) {

        CustomList<String> stringCustomList = new CustomList<>();
        stringCustomList.add("Element 1");
        stringCustomList.add("Element 2");
        System.out.println(stringCustomList);

        CustomList<Integer> integerCustomList = new CustomList<>();
        integerCustomList.add(8);
        integerCustomList.add(4);
        System.out.println(integerCustomList);

        System.out.println(stringCustomList.get(0));
        System.out.println(integerCustomList.get(1));
    }
}
