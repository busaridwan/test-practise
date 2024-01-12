package com.busaridwan.testpractice.designpatterns.strategy;

public class StrategyApplication {
    public static void main(String[] args) {
        Context addContext = new Context(new OperationAdd());
        System.out.println("3 + 4 = " + addContext.executeStrategy(3,4));

        Context subtractContext = new Context(new OperationSubtract());
        System.out.println("3 - 4 = " + subtractContext.executeStrategy(3,4));

        Context multiplyContext = new Context(new OperationMultiply());
        System.out.println("3 * 4 = " + multiplyContext.executeStrategy(3,4));
    }
}
