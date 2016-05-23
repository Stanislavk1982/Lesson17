package com.java.courses.patterns.strategy.main;

public class MainApplocation {
    public static void main(String[] args) {
        Compiler compiler = new Compiler(new CompilerJava());
        Compiler compiler1 = new Compiler(new CompilerVB());
        //CompilerStrategy strategy = new CompilerJava();
        //compiler.setStrategy(strategy);
        compiler.compiler("Some code");
        compiler1.compiler("Some code 2");
    }
}
