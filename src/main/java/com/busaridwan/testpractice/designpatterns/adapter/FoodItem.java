package com.busaridwan.testpractice.designpatterns.adapter;

import java.math.BigDecimal;

public class FoodItem implements Item {
    @Override
    public String getItemName() {
        return "Food Name";
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal("3.0");
    }

    @Override
    public String getRestaurantName() {
        return "Restaurant Name";
    }
}
