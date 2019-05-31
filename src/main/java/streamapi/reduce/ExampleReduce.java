package streamapi.reduce;

import java.util.Arrays;

public class ExampleReduce {
    public static void main(String[] args) {
        String[] myArray = {"this", "is", "a", "sentence"};
        System.out.println(Arrays.asList(myArray));

        String result = Arrays.stream(myArray)
                .reduce("", (a, b) -> a + b);

        System.out.println(result);
    }
}
