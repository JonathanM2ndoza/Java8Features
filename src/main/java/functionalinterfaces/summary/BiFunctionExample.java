package functionalinterfaces.summary;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {
        BiFunction<Person, Person, Integer> biFunction = (p1, p2) -> p1.getAge() + p2.getAge();

        int totalAge = biFunction.apply(new Person("Angelica", 7), new Person("Jonathan", 15));
        System.out.println(totalAge);
    }
}
