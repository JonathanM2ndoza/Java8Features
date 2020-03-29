package com.jmendoza.concurrency.synchronization;

public class SynchronizedThread extends Thread {

    private SynchronizedData synchronizedData;

    public void setSynchronizedData(SynchronizedData synchronizedData) {
        this.synchronizedData = synchronizedData;
    }

    @Override
    public void run() {
        while (synchronizedData.isFlag()) {
            synchronizedData.increaseCounter();
            System.out.println("Counter: " + synchronizedData.getCounter() + " - Thread: " + Thread.currentThread().getName());
        }
    }

    public void shutdown() {
        System.out.println("shutdown-Thread: " + Thread.currentThread().getName());
        synchronizedData.setFlag(false);
    }

    public void setFlag(SynchronizedData synchronizedData) {
        this.synchronizedData = synchronizedData;
    }

}
