package com.jmendoza.concurrency.async;

import java.util.List;

public class Order {
    private int orderId;
    private String orderStatus;
    private List<String> items;

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderStatus='" + orderStatus + '\'' +
                ", items=" + items +
                '}';
    }
}
