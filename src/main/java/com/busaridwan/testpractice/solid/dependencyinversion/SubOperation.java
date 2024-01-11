package com.busaridwan.testpractice.solid.dependencyinversion;

public class SubOperation implements CalculatorOperation{
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}
