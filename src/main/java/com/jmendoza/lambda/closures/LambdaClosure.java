package com.jmendoza.lambda.closures;

public class LambdaClosure {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        execute(x, i -> System.out.println(i + y));
    }

    private static void execute(int x, Process process) {
        process.execute(x);
    }
}
