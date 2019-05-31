package streamapi.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleMap {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList(
                "apple", "banana", "cherry", "lemon", "peach");

        List<String> fruitsUpper = fruits.stream().map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(fruitsUpper);

        List<String> fruitsFirstLetters = fruits.stream().map(f -> f.substring(0, 3)).collect(Collectors.toList());
        System.out.println(fruitsFirstLetters);

        Stream<String> streamWithB = fruits.stream().filter(f -> f.startsWith("b"));
        List<String> listWithB = streamWithB.collect(Collectors.toList());
        System.out.println(listWithB);

        System.out.println("=================================================");
        List<User> users = Arrays.asList(new User("Hamilton"), new User("Thompson"),
                new User("Stallman"), new User("Torvalds"));

        List<String> stringNames = users.stream().map(user -> user.getName()).map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(stringNames);
    }
}
