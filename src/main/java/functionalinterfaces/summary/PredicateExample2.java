package functionalinterfaces.summary;

import java.util.function.Predicate;

public class PredicateExample2 {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.equals("Hello World");
        System.out.println("predicate: " + predicate.test("Jonathan"));

        //AND logical operation
        Predicate<String> predicateAnd = predicate.and(s -> s.length() > 4);
        System.out.println("predicate And : " + predicateAnd.test("Hello World"));

        //OR logical operation
        Predicate<String> predicateOr = predicate.or(s -> s.length() == 10);
        System.out.println("predicate Or: " + predicateOr.test("Hello"));

        //NEGATE logical operation
        Predicate<String> predicateNegate = predicate.negate();
        System.out.println("predicate Negate: " + predicateNegate.test("Hello"));

        System.out.println(predicate.and(s -> s.length() > 4).test("Hello World"));
    }
}
