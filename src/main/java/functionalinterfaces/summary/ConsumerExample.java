package functionalinterfaces.summary;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // For instance, let’s greet everybody in a list of names by printing the greeting
        // in the console. The lambda passed to the List.forEach method implements the
        // Consumer functional interface:
        List<Person> listOfPerson = new ArrayList<Person>();
        listOfPerson.add(new Person("abc", 27));
        listOfPerson.add(new Person("mno", 26));
        listOfPerson.add(new Person("pqr", 28));
        listOfPerson.add(new Person("xyz", 27));

        System.out.println("ConsumerExample forEach:");
        listOfPerson.forEach((person) -> {
            System.out.println("Person name : " + person.getName());
            System.out.println("Person age : " + person.getAge());
        });


        // Second example
        System.out.println("ConsumerExample Consumer:");
        Consumer<Person> consumer = (person) -> {
            System.out.println("Person name : " + person.getName());
            System.out.println("Person age : " + person.getAge());
        };
        consumer.accept(new Person("Jonathan", 37));
    }
}
