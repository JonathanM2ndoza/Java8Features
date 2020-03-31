package com.jmendoza.concurrency.lockcondition;

public class Producer extends Thread {

    private ProducerConsumer producerConsumer;

    public Producer(ProducerConsumer producerConsumer, String name) {
        super(name);
        this.producerConsumer = producerConsumer;
    }

    @Override
    public void run() {
        try {
            producerConsumer.add();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
