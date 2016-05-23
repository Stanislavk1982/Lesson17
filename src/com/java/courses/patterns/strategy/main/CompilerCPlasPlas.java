package com.java.courses.patterns.strategy.main;

public class CompilerCPlasPlas implements CompilerStrategy {
    @Override
    public void compile(String code) {
        System.out.println("compile in C++. "+code);
    }
}
