package com.jmendoza.concurrency.executors;

public class ScheduledTask implements Runnable {

    private String taskName;

    public ScheduledTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " - taskName: " + taskName + " --> Start");
            Thread.sleep(30000);
            System.out.println(Thread.currentThread().getName() + " - taskName: " + taskName + " --> Finish");
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
