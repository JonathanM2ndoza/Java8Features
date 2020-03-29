package com.jmendoza.concurrency.visibility;

public class VolatileVisibility extends Thread {

    private VolatileData volatileData;

    public void setFlag(VolatileData volatileData) {
        this.volatileData = volatileData;
    }

    @Override
    public void run() {
        while (volatileData.isFlag()) {
            volatileData.increaseCounter();
            System.out.println("Counter: " + volatileData.getCounter() + " - Thread: " + Thread.currentThread().getName());
        }
    }

    public void shutdown() {
        System.out.println("shutdown-Thread: " + Thread.currentThread().getName());
        volatileData.setFlag(false);
    }
}
