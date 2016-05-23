package com.java.courses.patterns.strategy.main;

public class CompilerVB implements CompilerStrategy {
    @Override
    public void compile(String code) {
        System.out.println("compile in VB. "+code);
    }
}
