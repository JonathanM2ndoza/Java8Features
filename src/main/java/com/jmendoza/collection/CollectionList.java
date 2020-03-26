package com.jmendoza.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {

        List<Staff> staffList = new ArrayList<>();
        staffList.add(new Staff("Pedro", 10000.00, "HR"));
        staffList.add(new Staff("Carlos", 9000.00, "Finance"));
        staffList.add(new Staff("Maria", 8000.00, "HR"));
        staffList.add(new Staff("Andres", 5000.00, "Finance"));
        staffList.add(new Staff("Jose", 9000.00, "HR"));
        staffList.add(new Staff("Pepe", 7000.00, "IT"));

        System.out.println("=================== Collection: List ================");
        System.out.println("=================== forEach =========================");
        staffList.forEach(System.out::println);

        System.out.println("=================== removeIf =========================");
        staffList.removeIf(s -> "HR".equals(s.getDepartment()));
        staffList.forEach(System.out::println);

        System.out.println("=================== sort =========================");
        staffList.sort(Comparator.comparing(Staff::getSalary).reversed());
        staffList.forEach(System.out::println);

        System.out.println("=================== replaceAll =========================");
        staffList.replaceAll(CollectionList::salaryIncrease);
        staffList.forEach(System.out::println);
    }

    private static Staff salaryIncrease(Staff s) {
        if (s.getSalary() >= 7000.00)
            return s;
        else {
            s.setSalary(s.getSalary() + s.getSalary() * 0.1);
            return s;
        }
    }

}
