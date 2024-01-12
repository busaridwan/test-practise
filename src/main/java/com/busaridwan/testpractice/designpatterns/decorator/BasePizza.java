package com.busaridwan.testpractice.designpatterns.decorator;

public class BasePizza implements Pizza{
    @Override
    public String bake() {
        return "Base Pizza";
    }
}
