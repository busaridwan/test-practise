package com.busaridwan.testpractice.designpatterns.decorator;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }
    public String bake(){
        return pizza.bake() + addCheese();
    }
    public String addCheese(){
        return "cheese";
    }
}
