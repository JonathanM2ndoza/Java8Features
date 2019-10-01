package com.jmendoza.lambda.function;

import java.util.Arrays;
import java.util.List;

/**
 * Function— We say function because a lambda isn’t associated with a particular class like a method is.
 * But like a method, a lambda has a list of parameters, a body, a return type, and a possible list of
 * exceptions that can be thrown.
 */

public class LambdaFunction {

    public static void main(String[] args) {
        Task task = list -> {

            int sum;
            int listSize = list.size();
            System.out.println("listSize : " + listSize);

            sum = list.stream()
                    .mapToInt(Integer::intValue)
                    .sum();

            System.out.println("sum : " + sum);

            return (sum / listSize);
        };

        List<Integer> list = Arrays.asList(3, 2, 5);
        System.out.println(task.execute(list));
    }
}
