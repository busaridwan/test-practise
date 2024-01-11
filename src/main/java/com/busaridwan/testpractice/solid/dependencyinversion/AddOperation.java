package com.busaridwan.testpractice.solid.dependencyinversion;

public class AddOperation implements CalculatorOperation{
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
