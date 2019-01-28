package functionalinterfaces.summary;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        System.out.println("BiConsumerExample");
        BiConsumer<Integer, String> consumer = (a, b) -> System.out.println(a + b);
        consumer.accept(5, " Chapters");

        System.out.println("BiConsumerExample andThen, not change");
        BiConsumer<Integer, Integer> addition = (a, b) -> System.out.println(a + b);
        BiConsumer<Integer, Integer> subtraction = (a, b) -> System.out.println(a - b);
        // Using andThen()
        addition.andThen(subtraction).accept(10, 6);
    }
}
