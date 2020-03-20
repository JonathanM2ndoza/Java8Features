package com.jmendoza.lambda.innerclass;

public class Printer {

    public void print(Printing printing) {
        printing.execute();
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        // Lambda
        Printing printing = () -> System.out.println("Hello World with Lambda");

        // Interface Implementations
        Printing innerClassPrinting = new Printing() {
            @Override
            public void execute() {
                System.out.println("Hello World with Inner Class");
            }
        };

        printer.print(printing);
        printer.print(innerClassPrinting);
    }
}
