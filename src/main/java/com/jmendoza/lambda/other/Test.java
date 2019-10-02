package com.jmendoza.lambda.other;

public class Test {

    private int operate(int a, int b, Calculable calculable) {
        return calculable.operation(a, b);
    }

    public static void main(String[] args) {

        Test tobj = new Test();
        Calculable multiply = (x, y) -> x * y;
        System.out.println(tobj.operate(5, 7, multiply));
    }
}
