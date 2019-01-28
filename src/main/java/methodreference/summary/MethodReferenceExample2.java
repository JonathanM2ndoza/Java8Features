package methodreference.summary;

import java.util.Arrays;
import java.util.List;

/**
 * Reference to a static method
 */
public class MethodReferenceExample2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(20, 10, 15, 24, 55, 47, 16, 87, 88);

        System.out.println("Print even numbers using lambda expression");
        numbers.stream().map((n) -> EvenOddCheck.isEven2(n)).forEach((n) -> System.out.println(n));

        System.out.println("Print even numbers using method references");
        numbers.stream().map(EvenOddCheck::isEven2).forEach(System.out::println);
    }
}
