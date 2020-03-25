package com.jmendoza.generics;

import java.util.*;

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

        System.out.println("============= Generic Class  ========================");
        CustomList<String> stringCustomList = new CustomList<>();
        stringCustomList.add("Element 1");
        stringCustomList.add("Element 2");
        System.out.println(stringCustomList);

        CustomList<Integer> integerCustomList = new CustomList<>();
        integerCustomList.add(8);
        integerCustomList.add(4);
        System.out.println(integerCustomList);

        System.out.println("T get(int index): " + stringCustomList.get(0));
        System.out.println("T get(int index): " + integerCustomList.get(1));

        System.out.println("============= Generic Methods (add) ========================");
        System.out.println(Calculator.add(Arrays.asList(4, 5, 6, 7), Integer::sum));

        System.out.println("=========== Unbounded Wildcard ==================");
        printListItems(stringCustomList.getList());
        printListItems(integerCustomList.getList());

        System.out.println("=========== Upper Bounded Wildcards ==================");
        System.out.println(add(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println(add(Arrays.asList(1.1, 2.1, 3.1, 4.1, 5.1)));
        System.out.println(add(Arrays.asList(1L, 2L, 3L, 4L, 5L)));

        System.out.println("=========== Lower Bounded Wildcards ==================");
        List list = new ArrayList<Double>();
        addValues(list);
        System.out.println(list);

        System.out.println("============= Generic Methods (unionSet) ========================");
        Set<String> set1 = new HashSet<String>();
        set1.add("first");
        set1.add("second");
        set1.add("third");

        Set<String> set2 = new HashSet<String>();
        set2.add("first");
        set2.add("second");
        set2.add("computer");

        Set<String> resultSet = unionSet(set1, set2);
        System.out.println(resultSet);
    }

    //Unbounded Wildcard
    public static void printListItems(List<?> list) {
        list.forEach(System.out::println);
    }

    //Upper Bounded Wildcards
    static double add(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    //Lower Bounded Wildcards
    static void addValues(List<? super Integer> numbers) {
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        //numbers.add(3.1); error because it is restricted to the data type currently (Integer)
    }

    //Generic Methods
    public static <E> Set<E> unionSet(Set<E> set1, Set<E> set2) {
        Set<E> result = new HashSet<E>(set1);
        result.addAll(set2);
        return result;
    }


}
