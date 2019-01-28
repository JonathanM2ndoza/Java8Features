package functionalinterfaces.summary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class HighOrderFunctionTest {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, -9, 8, -3, 2, -5, 4, 6);
        BiFunction<List<Integer>, Predicate<Integer>, List<Integer>> filter = (list, predicate) -> {
            List<Integer> result = new ArrayList<>();
            for (Integer i : list) if (predicate.test(i)) result.add(i);
            return result;
        };

        System.out.println(filter.apply(numbers, x -> x > 0));
    }
}
