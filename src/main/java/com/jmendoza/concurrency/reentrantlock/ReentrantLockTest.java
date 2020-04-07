package com.jmendoza.concurrency.reentrantlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

    private static ReentrantLock reentrantLock = new ReentrantLock();
    private static int counter = 0;
    private static ExecutorService executorService = Executors.newFixedThreadPool(20);

    public static void main(String[] args) {

        executorService.execute(() -> {
            for (int i = 0; i < 1000; i++) {
                Thread thread1 = new Thread(() -> accessResource());
                thread1.start();
            }
        });
        executorService.shutdown();
    }

    private static void accessResource() {
        reentrantLock.lock();
        try {
            System.out.println("Thread:" + Thread.currentThread().getName());
            System.out.println("Counter: " + counter++);
        } finally {
            reentrantLock.unlock();
        }
    }

}
