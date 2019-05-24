package functionalinterfaces.example1;

/**
 * In Java 8, functional interfaces can be represented using lambda expressions, method reference and constructor references as well.
 */
@FunctionalInterface
public interface Sayable {
    void say(String msg);   // abstract method

    // It can contain any number of Object class methods.
    int hashCode();

    String toString();

    @Override
    public boolean equals(Object obj);

    default void doSomeMoreWork1() {
        System.out.println("default method 1 - FunctionalInterface");
    }

    default void doSomeMoreWork2() {
        System.out.println("default method 2 - FunctionalInterface");
    }

    static String getMessage(String s) {
        return s.concat(" example static - FunctionalInterface");
    }
}
