package com.jmendoza.concurrency.synchronization;

public class SynchronizedData {
    private boolean flag;
    private int counter;

    public SynchronizedData(boolean flag, int counter) {
        this.flag = flag;
        this.counter = counter;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public synchronized int getCounter() {
        return this.counter;
    }

    public synchronized void increaseCounter() {
        this.counter++;
    }
}
