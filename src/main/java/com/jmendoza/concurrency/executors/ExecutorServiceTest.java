package com.jmendoza.concurrency.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {
    public static void main(String[] args) {

        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(coreCount);
        System.out.println("Available Processors: " + coreCount);

        for (int i = 0; i < 10; i++) {
            executorService.execute(new CpuTask("CpuTask-" + i));
        }
        executorService.shutdown();
    }
}
