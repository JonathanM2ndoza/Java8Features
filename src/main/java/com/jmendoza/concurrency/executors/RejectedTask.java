package com.jmendoza.concurrency.executors;

public class RejectedTask implements Runnable {

    private int taskId;
    private String taskName;

    public RejectedTask(int taskId, String taskName) {
        this.taskId = taskId;
        this.taskName = taskName;
        System.out.println(taskName.concat(" taskId: ") + taskId + " Created");
    }

    @Override
    public void run() {
        Thread curThread = Thread.currentThread();
        try {
            taskName = curThread.getName();
            System.out.println(taskName + " Executing " + taskId);
            Thread.sleep(1000);
            System.out.println(taskName + " Completed " + taskId);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "RejectedTask{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                '}';
    }
}
