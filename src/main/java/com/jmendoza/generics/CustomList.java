package com.jmendoza.generics;

import java.util.ArrayList;

public class CustomList<T> {
    private ArrayList<T> list = new ArrayList();

    public void add(T t) {
        list.add(t);
    }

    public void remove(T t) {
        list.remove(t);
    }

    public T get(int index) {
        return list.get(index);
    }

    public ArrayList<T> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "CustomList{" +
                "list=" + list +
                '}';
    }
}
