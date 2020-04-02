package com.jmendoza.concurrency.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class RejectedExecutionHandlerTest {

    public static final ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
    public static final ThreadPoolExecutor alternateExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);

    public static void main(String[] args) {

        RejectedExecutionHandler handler = new RejectedExecutionHandlerTask();
        executor.setRejectedExecutionHandler(handler);

        System.out.println("Starting ThreadPoolExecutor");

        RejectedTask[] workers = new RejectedTask[10];
        for (int i = 0; i < 10; i++) {
            workers[i] = new RejectedTask(i, "Task");
            executor.execute(workers[i]);
            if (i == 6)
                executor.shutdown();// The executor is terminated intentionally to check the RejectedExecutionHandler
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
            //Waiting for the termination of executor
        }
        System.out.println("Execution Completed");

        alternateExecutor.shutdown();
        while (!alternateExecutor.isTerminated()) {
            //Waiting for the termination of alternateExecutor
        }
        System.out.println("Alternate Execution Completed");
    }
}
