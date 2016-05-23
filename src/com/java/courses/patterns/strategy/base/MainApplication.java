package com.java.courses.patterns.strategy.base;

public class MainApplication {
    public static void main(String[] args) {
        Compiler compiler = new Compiler("c#");
        compiler.compile("Sample code");
    }
}
