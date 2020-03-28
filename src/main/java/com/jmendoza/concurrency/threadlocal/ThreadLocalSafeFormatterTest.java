package com.jmendoza.concurrency.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalSafeFormatterTest {

    // 10 Threads
    private static ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {

        // 10 Task
        for (int i = 0; i < 10; i++) {
            int id = i;
            executorService.submit(() -> {
                System.out.println("Thread: " + Thread.currentThread().getName());
                String birthDate = new ThreadLocalSafeFormatterTest().getBirthDatebyId(id);
                System.out.println("Thread: " + Thread.currentThread().getName() + " - birthDate: " + birthDate);
            });
            //Thread.sleep(1000);
        }
        executorService.shutdown();
    }

    public String getBirthDatebyId(int id) {
        System.out.println("Method getBirthDatebyId: " + id + " Thread: " + Thread.currentThread().getName());
        Date birthDate = new Date(); // Search date in DB by id
        System.out.println("Method getBirthDatebyId: " + birthDate + " Thread: " + Thread.currentThread().getName());
        final SimpleDateFormat simpleDateFormat = ThreadLocalSafeFormatter.simpleDateFormatThreadLocal.get();
        return simpleDateFormat.format(birthDate);
    }
}