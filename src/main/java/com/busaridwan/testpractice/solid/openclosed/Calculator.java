package com.busaridwan.testpractice.solid.openclosed;

public class Calculator {
    public static int calculateNumber(int num1, int num2, Operation operation){
        return operation.perform(num1, num2);
    }

    public static void main(String[] args) {
        System.out.println(calculateNumber(3,4,new AddOperation()));
    }

}
