package com.jmendoza.concurrency.visibility;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileData {
    private volatile boolean flag;
    private AtomicInteger counter;

    public VolatileData(boolean flag, AtomicInteger counter) {
        this.flag = flag;
        this.counter = counter;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCounter() {
        return counter.get();
    }

    public void increaseCounter() {
        this.counter.incrementAndGet();
    }
}
