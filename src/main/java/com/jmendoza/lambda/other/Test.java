package com.jmendoza.lambda.other;

public class Test {

    private int operate(int a, int b, Calculable calculable) {

        return calculable.operation(a, b);
    }

    public static void main(String[] args) {

        Test test = new Test();
        System.out.println("Multiply: " + test.operate(5, 7, (x, y) -> x * y));

        System.out.println("Sum: " + test.operate(5, 7, (x, y) -> x + y));
    }
}
