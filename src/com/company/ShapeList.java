package com.company;

import java.util.ArrayList;
import java.util.List;

class ShapeList<T> {
    private List<T> shapes = new ArrayList<>();

    public void add(T s) {
        shapes.add(s);
    }

    public int CircleCounter() {
        int count = 0;
        for (T s : shapes) {
            if (s instanceof Circle) {
                count++;
            }
        }
        return count;
    }


}
