package methodreference.summary;

/**
 * There are four types of method references.
 * <p>
 * Type	Example
 * Reference to a static method	Math::random;
 * Reference to an instance method of a particular object	(new Random())::nextInt;
 * Reference to an instance method of an arbitrary object of a particular type	String::toUpperCase;
 * Reference to a constructor	String:: new;
 */

public class MethodReferenceExample1 {
    public static void main(String[] args) {
        // Using lambda expression
        Predicate predicate1 = (n) -> EvenOddCheck.isEven(n);
        System.out.println(predicate1.test(2));

        // Using method reference
        Predicate predicate2 = EvenOddCheck::isEven;
        System.out.println(predicate2.test(25));

    }
}
