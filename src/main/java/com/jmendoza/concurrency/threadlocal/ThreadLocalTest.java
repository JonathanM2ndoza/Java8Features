package com.jmendoza.concurrency.threadlocal;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalTest {

    // 10 Threads
    private static ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws InterruptedException {

        // 1000 Task
        for (int i = 0; i < 10; i++) {
            int id = i;
            executorService.execute(() -> {
                System.out.println("Thread: " + Thread.currentThread().getName());
                String birthDate = new ThreadLocalTest().getBirthDatebyId(id);
                System.out.println("birthDate: " + birthDate);
            });
        }
        Thread.sleep(1000);
    }

    public String getBirthDatebyId(int id) {
        System.out.println("Method getBirthDatebyId: " + id);
        LocalDate birthDate = LocalDate.now(); // Search date in DB by id
        final SimpleDateFormat simpleDateFormat = TheadSafeFormatter.simpleDateFormatThreadLocal.get();
        return simpleDateFormat.format(birthDate);
    }
}
