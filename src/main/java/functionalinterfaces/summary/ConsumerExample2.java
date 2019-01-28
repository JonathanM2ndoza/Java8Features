package functionalinterfaces.summary;

import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        /* It represents an operation that accepts a single argument and returns no result. */
        Consumer<String> consumerStr = s -> System.out.println(s);
        consumerStr.accept("Hello Java.");
        consumerStr.accept("Hello World.");

        Consumer<Integer> consumerInt = i -> System.out.println("Integer value=" + i);
        consumerInt.accept(5);
        consumerInt.accept(8);

        System.out.println("Consumer andThen, not change");
        Consumer<String> consumer1=s-> System.out.println(s+" World.");
        Consumer<String> consumer2=s-> System.out.println(s+" Java.");

        //Using andThen method
        consumer1.andThen(consumer2).accept("Hello");

    }
}
