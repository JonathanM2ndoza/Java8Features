package com.jmendoza.generics;

import java.util.ArrayList;
import java.util.List;

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

    public List<T> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "CustomList{" +
                "list=" + list +
                '}';
    }
}
