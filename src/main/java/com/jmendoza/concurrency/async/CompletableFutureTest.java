package com.jmendoza.concurrency.async;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest {

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            CompletableFuture.supplyAsync(() -> getOrder())
                    .thenApply(order -> enrich(order))
                    .thenApply(order -> payment(order))
                    .thenAccept(order -> dispatch(order));
        }
    }

    public static Order getOrder() {
        final int orderId = new Random().nextInt();
        System.out.println("Order created: " + orderId);
        return new Order(orderId);
    }

    public static Order enrich(Order order) {

        List<String> items = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            items.add(RandomStringUtils.randomAlphanumeric(10));
        }
        order.setItems(items);
        System.out.println("Order with item : " + order.getOrderId());
        return order;
    }

    public static Order payment(Order order) {
        order.setOrderStatus("Paid order");
        System.out.println("Paid order: " + order.getOrderId());
        return order;
    }

    public static void dispatch(Order order) {
        System.out.println("Dispatching order: " + order);
    }
}
