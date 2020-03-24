package com.jmendoza.generics;

import java.util.ArrayList;

public class CustomList<T> {
    private ArrayList<T> arrayList = new ArrayList();

    public void add(T t) {
        arrayList.add(t);
    }

    public void remove(T t) {
        arrayList.remove(t);
    }

    @Override
    public String toString() {
        return "CustomList{" +
                "arrayList=" + arrayList +
                '}';
    }
}
