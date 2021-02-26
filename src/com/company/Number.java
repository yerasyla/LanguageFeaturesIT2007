package com.company;

import java.util.ArrayList;
import java.util.List;

class Number<T extends Comparable<T>> {
    private boolean isSorted;

    private List<T> numberList = new ArrayList<>();

    public void addNumbers(T number) {
        numberList.add(number);
    }

    public void sortNumbers() {
        for (int i = 0; i < numberList.size(); i++) {
            for (int j = 0; j < numberList.size() - i - 1; j++) {
                if (numberList.get(j).compareTo(numberList.get(j + 1)) > 0) {
                    T temp = numberList.get(j);
                    numberList.set(j, numberList.get(j + 1));
                    numberList.set(j + 1, temp);
                }

            }

        }

    }

    public void print() {
        for (T n : numberList) {
            System.out.println(n);

        }
    }
    //todo to check if arrayList is sorted

}
