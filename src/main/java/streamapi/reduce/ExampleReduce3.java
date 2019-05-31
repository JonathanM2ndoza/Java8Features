package streamapi.reduce;

import java.util.Arrays;
import java.util.List;

public class ExampleReduce3 {
    public static void main(String[] args) {
        List<Integer> list2 = Arrays.asList(5, 6, 7);
        int res = list2.parallelStream().reduce(1, (s1, s2) -> s1 * s2, (p, q) -> p * q);
        System.out.println(res);

        //Reduce Array to sum.
        int[] array = {30, 10, 20, 40};
        int sum = Arrays.stream(array).reduce(0, (x, y) -> x + y);
        System.out.println("Sum of Array: " + sum);

        //Reduce List to sum.
        List<Integer> list = Arrays.asList(30, 10, 20, 40);
        sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum of List: " + sum);
    }
}
