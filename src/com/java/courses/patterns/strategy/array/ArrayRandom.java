package com.java.courses.patterns.strategy.array;

import java.util.Random;

public class ArrayRandom implements ArrayStrategy {
    @Override
    public int getNumber(int[] array) {
        Random random = new Random();
        int i = random.nextInt(array.length-1);
       // System.out.println("random:" + array[i]);
        return array[i];
    }
}
