package com.jmendoza.concurrency.executors;

public class CpuTask implements Runnable {

    private String taskName;

    public CpuTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " - taskName: " + taskName);
    }
}
