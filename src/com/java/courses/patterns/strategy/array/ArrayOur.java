package com.java.courses.patterns.strategy.array;

public class ArrayOur {
    private ArrayStrategy arrayStrategy;

    public ArrayOur(ArrayStrategy arrayStrategy) {
        this.arrayStrategy=arrayStrategy;
    }

    public int compile(int[] array) {
        return (arrayStrategy.getNumber(array));
    }

}
