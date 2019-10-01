package com.jmendoza.lambda.parameter;

public class LambdaParameters {
    public static void main(String[] args) {

        //Zero Parameters
        Vehicle vehicle0 = () -> "Audi...";
        System.out.println("Zero Parameters: " + vehicle0.getBrand());

        //Zero Parameters and curly braces
        vehicle0 = () -> {
            String model = "e-tron";
            return "Audi... " + model;
        };
        System.out.println("Zero Parameters and curly braces: " + vehicle0.getBrand());

        //===========================================

        //One Parameter
        Printable printable = x -> System.out.println(x);
        printable.print("One Parameter: Hello World");

        //Multiple Parameters
        Addable addable = (x, y) -> x + y;
        System.out.println("Multiple Parameters: " + addable.add(9, 1));

    }
}
