package functionalinterfaces.summary;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample2 {
    public static void main(String[] args) {
        System.out.println("Example BiFunction");
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        System.out.println(biFunction.apply(100, 200));

        System.out.println("Example BiFunction - Using andThen");
        BiFunction<Integer, Integer, Integer> function1 = (a, b) -> a + b;
        Function<Integer, Integer> function2 = n -> n * n;

        //Using andThen()
        System.out.println(function1.andThen(function2).apply(5, 5));
        System.out.println(function1.andThen(function2).apply(12, 2));
    }
}
