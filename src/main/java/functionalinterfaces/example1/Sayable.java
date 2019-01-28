package functionalinterfaces.example1;

@FunctionalInterface
public interface Sayable {
    void say(String msg);   // abstract method
    // It can contain any number of Object class methods.
    int hashCode();
    String toString();
    boolean equals(Object obj);
}
