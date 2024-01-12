package com.busaridwan.testpractice.designpatterns.decorator;

public abstract class PizzaDecorator implements Pizza{
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String bake() {
        return pizza.bake();
    }
}
