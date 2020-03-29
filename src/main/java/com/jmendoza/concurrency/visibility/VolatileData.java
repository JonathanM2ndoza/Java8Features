package com.jmendoza.concurrency.visibility;

public class VolatileData {
    private volatile boolean flag;
    private volatile int counter = 0;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
        System.out.println("setFlag: " + flag);
    }

    public int getCounter() {
        return counter;
    }

    public void increaseCounter() {
        this.counter++;
    }
}
