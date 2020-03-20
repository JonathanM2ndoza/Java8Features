package com.jmendoza.lambda.runnable;

public class LambdaRunnable {
    public static void main(String[] args) {

        //Without Lambda
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello inside Runnable");
            }
        });
        thread.run();

        //With Lambda
        Thread threadLambda = new Thread(()->System.out.println("Hello inside Lambda Runnable"));
        threadLambda.run();
    }
}
