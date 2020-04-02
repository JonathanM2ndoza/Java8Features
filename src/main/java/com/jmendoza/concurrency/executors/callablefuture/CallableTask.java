package com.jmendoza.concurrency.executors.callablefuture;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(3000);
        return new Random().nextInt();
    }
}