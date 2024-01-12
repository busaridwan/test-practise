package com.busaridwan.testpractice.designpatterns.decorator;

public class JelanoDecorator extends PizzaDecorator{
    public JelanoDecorator(Pizza pizza) {
        super(pizza);
    }
    public String bake(){
        return pizza.bake() + addJelano();
    }
    public String addJelano(){
        return "Jelano";
    }
}
