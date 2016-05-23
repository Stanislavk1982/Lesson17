package com.java.courses.patterns.strategy.main;

public class MainApplicationWithAnonymus {
    public static void main(String[] args) {
        Compiler compiler = new Compiler(new CompilerStrategy() {
            @Override
            public void compile(String code) {
                System.out.println("compile with Haskel"+code);
            }
        });
        compiler.compiler("some code");
    }
}
