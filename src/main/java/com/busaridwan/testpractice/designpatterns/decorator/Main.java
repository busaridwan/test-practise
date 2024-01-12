package com.busaridwan.testpractice.designpatterns.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new JelanoDecorator(new CheeseDecorator(new BasePizza()));
        System.out.println(pizza.bake());
    }
}
