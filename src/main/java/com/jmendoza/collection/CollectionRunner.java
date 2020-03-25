package com.jmendoza.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionRunner {
    public static void main(String[] args) {

        List<Staff> staffList = new ArrayList<>();
        staffList.add(new Staff("Pedro", 10000.00, "HR"));
        staffList.add(new Staff("Carlos", 90000.00, "Finance"));
        staffList.add(new Staff("Maria", 80000.00, "HR"));
        staffList.add(new Staff("Andres", 90000.00, "Finance"));
        staffList.add(new Staff("Jose", 90000.00, "HR"));

        System.out.println("=================== forEach =========================");
        staffList.forEach(System.out::println);
        System.out.println("=================== removeIf =========================");
        staffList.removeIf(x -> "HR".equals(x.getDepartment()));
        staffList.forEach(System.out::println);

    }
}
