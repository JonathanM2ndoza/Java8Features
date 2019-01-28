package streamapi.summary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class StreamIfElselogic {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        //1. Java 8 stream – if-else logic
        Consumer<Integer> action = i -> {
            if(i % 2 == 0) {
                System.out.println("Even number :: " + i);
            } else {
                System.out.println("Odd  number :: " + i);
            }
        };
        numberList.stream().forEach(action);

        //2. Java 8 stream if logic – lambda conditional filter
        numberList.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

    }
}
