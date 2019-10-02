package com.jmendoza.lambda.passedaround;

public class LambdaArgument {
    public static void main(String[] args) {

        TaskImpl task = new TaskImpl();
        String string = task.execute(x -> x + " from lambda");
        System.out.println(string);
    }
}
