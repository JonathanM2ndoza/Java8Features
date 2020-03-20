package com.jmendoza.lambda.innerclass;

/**
 * A functional interface in Java is an interface that contains only a single abstract (unimplemented) method.
 * A functional interface can contain default and static methods which do have an implementation, in addition to the single unimplemented method.
 */
@FunctionalInterface
public interface Printing {
    void execute();

    default void show(){
        System.out.println("FunctionalInterface - default method show()");
    };

    default void clear(){
        System.out.println("FunctionalInterface - default method clear()");
    };

}