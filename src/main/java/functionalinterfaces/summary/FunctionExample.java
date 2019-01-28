package functionalinterfaces.summary;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // convert centigrade to fahrenheit
        Function<Integer, Double> centigradeToFahrenheitInt = x -> new Double((x * 9 / 5) + 32);
        System.out.println("Function - Centigrade to Fahrenheit: " + centigradeToFahrenheitInt.apply(100));

        // String to an integer
        Function<String, Integer> stringToInt = x -> Integer.valueOf(x);
        System.out.println("Function - String to Int: " + stringToInt.apply("4"));

        Function<PersonEntity, Person> function = (entity) -> new Person(entity.getName(), entity.getAge());
        Person Person = function.apply(new PersonEntity("Jonathan", 20));
        System.out.println("Function - PersonEntity to Person: " + Person.getName() + " - " + Person.getAge());

    }
}
