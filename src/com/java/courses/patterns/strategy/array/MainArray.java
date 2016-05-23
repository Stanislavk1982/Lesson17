package com.java.courses.patterns.strategy.array;

public class MainArray {
    public static void main(String[] args) {
        int[] i = {1, 3, 5, 7};
        ArrayOur arrayOur = new ArrayOur(new ArrayMax());
       int max = arrayOur.compile(i);
        ArrayOur arrayOur1 = new ArrayOur(new ArrayMin());
        int min = arrayOur1.compile(i);
        ArrayOur arrayOur2 = new ArrayOur(new ArrayRandom());
        int random = arrayOur2.compile(i);
        System.out.println("min: "+min);
        System.out.println("max:"+ max);
        System.out.println("random: "+random);

    }
}
