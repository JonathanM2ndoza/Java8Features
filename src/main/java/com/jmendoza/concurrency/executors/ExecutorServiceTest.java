package com.jmendoza.concurrency.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Task Type            Ideal pool size (ThreadPool)
 * CPU Intensive        CPU Core count
 * IO Intensive         Hig
 */
public class ExecutorServiceTest {
    public static void main(String[] args) {

        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(coreCount);
        System.out.println("Available Processors: " + coreCount);

        for (int i = 0; i < 20; i++) {
            executorService.execute(new CpuTask("CpuTask-" + i));
        }
        executorService.shutdown();
    }
}
