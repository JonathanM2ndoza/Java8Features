package com.jmendoza.lambda.anonymous;

import java.util.Arrays;
import java.util.List;

/**
 * Anonymous— We say anonymous because it doesn’t have an explicit name like a method would
 * normally have: less to write and think about!
 */

public class LambdaAnonymous {
    public static void main(String[] args) {

        Task task = (x) -> System.out.println("Example Lambda Anonymous: " + x);
        task.execute("Hello Lambda!");

        task = x -> {
            System.out.println(x);
            List<String> list = Arrays.asList("A", "B", "C", "D");
            list.forEach(y -> System.out.println(y));
        };

        task.execute("Hello Lambda Two!");
    }
}
