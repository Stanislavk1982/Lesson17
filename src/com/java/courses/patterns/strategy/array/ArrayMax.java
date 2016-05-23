package com.java.courses.patterns.strategy.array;

public class ArrayMax implements ArrayStrategy {
    @Override
    public int getNumber(int[] array) {
        int max=-111;
        for (int i=0;i<array.length;i++) {
            if (max < array[i]) {
                max=array[i];
            }
        }
        //System.out.println("Max:"+max);
        return max;
    }
}
