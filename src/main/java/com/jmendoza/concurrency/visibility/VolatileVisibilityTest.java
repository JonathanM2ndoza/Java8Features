package com.jmendoza.concurrency.visibility;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class VolatileVisibilityTest {

    private static ExecutorService executorService = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {

        executorService.submit(() -> {
            try {
                VolatileData volatileData = new VolatileData(true, new AtomicInteger(0));
                VolatileVisibility volatileVisibility = new VolatileVisibility();
                volatileVisibility.setFlag(volatileData);
                volatileVisibility.start();

                VolatileVisibility volatileVisibility2 = new VolatileVisibility();
                volatileVisibility2.setFlag(volatileData);
                volatileVisibility2.start();
                Thread.sleep(100);
                volatileVisibility2.shutdown();
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        });

        executorService.shutdown();
        System.out.println("Thread: " + Thread.currentThread().getName());

    }
}
