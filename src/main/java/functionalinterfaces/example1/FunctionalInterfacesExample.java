package functionalinterfaces.example1;

// An Interface that contains exactly one abstract method is known as functional interface
// It can have any number of default, static methods but can contain only one abstract method. It can also declare methods of object class.
// It is a new feature in Java, which helps to achieve functional programming approach.
// The Java API has many one-method interfaces such as Runnable, Callable, Comparator, ActionListener and others. They can be implemented and instantiated using anonymous class syntax.


// Rules
// A functional interface can extends another interface only when it does not have any abstract method.

public class FunctionalInterfacesExample {
    public static void main(String[] args) {
        Sayable sayable = (msg) -> System.out.println(msg);
        sayable.say("Say something ..");
        sayable.doSomeMoreWork1();
        sayable.doSomeMoreWork2();

        System.out.println(Sayable.getMessage("Test FunctionalInterfaces"));
    }
}
