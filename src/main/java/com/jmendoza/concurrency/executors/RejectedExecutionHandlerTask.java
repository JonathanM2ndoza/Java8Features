package com.jmendoza.concurrency.executors;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class RejectedExecutionHandlerTask implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable task, ThreadPoolExecutor executor) {
        System.out.println(task.toString() + " is Rejected");
        System.out.println("Retrying to Execute");
        try {
            //Re-executing with alternateExecutor
            RejectedExecutionHandlerTest.alternateExecutor.execute(task);
            System.out.println(task.toString() + " Execution Started");
        } catch (Exception e) {
            System.out.println("Failure to Re-exicute " + e.getMessage());
        }
    }
}
