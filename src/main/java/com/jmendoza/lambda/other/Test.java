package com.jmendoza.lambda.other;

import com.jmendoza.stream.model.User;

import java.util.*;

public class Test {

    private int operate(int a, int b, Calculable calculable) {

        return calculable.operation(a, b);
    }

    public static void main(String[] args) {

        Test test = new Test();
        System.out.println("Multiply: " + test.operate(5, 7, (x, y) -> x * y));

        System.out.println("Sum: " + test.operate(5, 7, (x, y) -> x + y));

        // Sort
        List<User> userList = Arrays.asList(
                new User("jmendoza", 1),
                new User("amendoza", 2),
                new User("noche", 3),
                new User("agil", 4)
        );
        System.out.println(userList.toString());

        //Lambda
        //Collections.sort(userList,(p1,p2)->p1.getUserName().compareTo(p2.getUserName()));

        //Method References
        Collections.sort(userList, Comparator.comparing(User::getUserName));
        System.out.println(userList.toString());
    }
}
