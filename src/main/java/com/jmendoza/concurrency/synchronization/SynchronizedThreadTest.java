package com.jmendoza.concurrency.synchronization;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedThreadTest {

    private static ExecutorService executorService = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {

        executorService.submit(() -> {
            try {
                SynchronizedData synchronizedData = new SynchronizedData(true, 0);
                SynchronizedThread synchronizedThread = new SynchronizedThread();
                synchronizedThread.setFlag(synchronizedData);
                synchronizedThread.start();

                SynchronizedThread synchronizedThread1 = new SynchronizedThread();
                synchronizedThread1.setFlag(synchronizedData);
                synchronizedThread1.start();
                Thread.sleep(100);
                synchronizedThread1.shutdown();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        });

        executorService.shutdown();
        System.out.println("Thread: " + Thread.currentThread().getName());
    }
}
