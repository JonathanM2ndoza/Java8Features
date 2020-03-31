package com.jmendoza.concurrency.lockcondition;

public class Consumer extends Thread {

    private ProducerConsumer producerConsumer;

    public Consumer(ProducerConsumer producerConsumer) {
        super("CONSUMER");
        this.producerConsumer = producerConsumer;
    }

    @Override
    public void run() {
        try {
            producerConsumer.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
