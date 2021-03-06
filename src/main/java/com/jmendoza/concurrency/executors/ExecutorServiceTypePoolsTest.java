package com.jmendoza.concurrency.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTypePoolsTest {

    public static void main(String[] args) throws InterruptedException {

        /**
         * Creates single thread to execute all tasks. Use it when you have only one task to execute (sequentially).
         */
        System.out.println("==================newSingleThreadExecutor==================");
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> System.out.println("Task 1"));
        executor.submit(() -> System.out.println("Task 2"));
        executor.submit(() -> System.out.println("Task 3"));
        executor.shutdown();
        Thread.sleep(1000);

        /**
         * This method creates a thread pool that creates new threads as needed but will reuse previously constructed threads when they are available.
         * These pools will typically improve the performance of programs that execute many short-lived asynchronous tasks.
         */
        System.out.println("==================newCachedThreadPool==================");
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            executorService.execute(new CpuTask("CpuTaskCache-" + i));
        }
        executorService.shutdown();
        Thread.sleep(2000);

        /**
         * An ExecutorService that can schedule commands to run after a given delay, or to execute periodically.
         * The schedule methods create tasks with various delays and return a task object that can be used to cancel or check execution.
         * The scheduleAtFixedRate and scheduleWithFixedDelay methods create and execute tasks that run periodically until cancelled.
         */
        System.out.println("==================newScheduledThreadPool==================");
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);
        // Task to run after 5 seconds delay
        scheduledExecutorService.schedule(new CpuTask("CpuTaskSchule"), 5, TimeUnit.SECONDS);
        // Task to run repeatedly every 6 seconds
        scheduledExecutorService.scheduleAtFixedRate(new CpuTask("CpuTaskScheduleAtFixedRate"), 10, 6, TimeUnit.SECONDS);
        // Task to run repeatedly 6 seconds after previous task completes, for example ScheduledTask
        scheduledExecutorService.scheduleWithFixedDelay(new ScheduledTask("CpuTaskScheduleWithFixedDelay"), 10, 6, TimeUnit.SECONDS);

        //scheduledExecutorService.shutdown();
    }
}
