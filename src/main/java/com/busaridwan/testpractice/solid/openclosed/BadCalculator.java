package com.busaridwan.testpractice.solid.openclosed;

public class BadCalculator {
    public  static int calculateNumber(int num1, int num2, OperationEnum operation){
        int result = 0;
        switch (operation){
            case ADD -> result = num1 + num2;
            case SUB -> result = num1 - num2;
            case MUL -> result = num1 * num2;
            case DIV -> result = num1 / num2;
            case REM -> result = num1 % num2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateNumber(3,4,OperationEnum.ADD));
    }
}
