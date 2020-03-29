package com.jmendoza.concurrency.visibility;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VolatileVisibilityTest {

    private static ExecutorService executorService = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {

        executorService.submit(() -> {
            try {
                VolatileData volatileData = new VolatileData();
                volatileData.setFlag(true);
                VolatileVisibility volatileVisibility = new VolatileVisibility();
                volatileVisibility.setFlag(volatileData);
                volatileVisibility.start();

                VolatileVisibility volatileVisibility2 = new VolatileVisibility();
                volatileVisibility2.setFlag(volatileData);
                volatileVisibility2.start();
                Thread.sleep(100);
                volatileVisibility2.shutdown();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        });

        executorService.shutdown();
        System.out.println("Thread: " + Thread.currentThread().getName());

    }
}
