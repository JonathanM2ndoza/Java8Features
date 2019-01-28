package functionalinterfaces.summary;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        Predicate<Person> predicate = (person) -> person.getAge() > 28;
        boolean result = predicate.test(new Person("Ejemplo", 8));
        System.out.println("PredicateExample: " + result);
        System.out.println("PredicateExample 2: " + predicate.test(new Person("Jonathan", 37)));

    }

}
