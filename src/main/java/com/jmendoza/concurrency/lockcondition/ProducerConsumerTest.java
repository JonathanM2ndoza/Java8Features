package com.jmendoza.concurrency.lockcondition;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerTest {

    private static ExecutorService executorService = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        executorService.execute(() -> {
            for (int i = 0; i < 1000; i++) {
                Producer producer = new Producer(producerConsumer, "PRODUCER: " + i);
                Consumer consumer = new Consumer(producerConsumer, "CONSUMER: " + i);

                consumer.start();
                producer.start();
            }
        });
        executorService.shutdown();
    }
}
