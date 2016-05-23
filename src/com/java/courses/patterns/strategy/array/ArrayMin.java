package com.java.courses.patterns.strategy.array;

public class ArrayMin implements ArrayStrategy {
    @Override
    public int getNumber(int[] array) {
        int min=111;
        for (int i=0; i<array.length;i++) {
            if (min > array[i]) {
                min=array[i];
            }
        }
        //System.out.println("Min:" + min);
        return min;
    }
}
