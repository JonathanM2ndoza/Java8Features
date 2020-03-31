package com.jmendoza.concurrency.lockcondition;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer {

    private static final int CAPACITY = 7;
    private Queue queue = new LinkedList<>();
    private Random random = new Random();

    private Lock lock = new ReentrantLock();
    private Condition bufferNotFull = lock.newCondition();
    private Condition bufferFull = lock.newCondition();

    public void add() throws InterruptedException {
        lock.lock();
        try {
            while (queue.size() == CAPACITY) {
                System.out.println(Thread.currentThread().getName() + " : Buffer is full, waiting");
                bufferFull.await();
            }

            int number = random.nextInt();
            boolean isAdded = queue.offer(number);
            if (isAdded) {
                System.out.printf("%s Added %d into queue %n", Thread.currentThread().getName(), number);
                // signal consumer thread that, buffer has element now
                System.out.println(Thread.currentThread().getName() + " : Signalling that buffer is no more empty now");
                bufferNotFull.signalAll();
            }
        } finally {
            lock.unlock();
        }
    }

    public void get() throws InterruptedException {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                System.out.println(Thread.currentThread().getName() + " : Buffer is empty, waiting");
                bufferNotFull.await();
            }

            Integer value = (Integer) queue.poll();
            if (value != null) {
                System.out.printf("%s Consumed %d from queue %n", Thread.currentThread().getName(), value);
                // signal producer thread that, buffer may be empty now
                System.out.println(Thread.currentThread().getName() + " : Signalling that buffer may be empty now");
                bufferFull.signalAll();
            }
        } finally {
            lock.unlock();
        }
    }


}