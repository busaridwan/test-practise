package com.busaridwan.testpractice.solid.openclosed;

public class AddOperation implements Operation{
    @Override
    public int perform(int num1, int num2) {
        return num1 + num2;
    }
}
