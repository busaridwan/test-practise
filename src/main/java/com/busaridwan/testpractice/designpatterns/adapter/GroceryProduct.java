package com.busaridwan.testpractice.designpatterns.adapter;

import java.math.BigDecimal;

public class GroceryProduct implements GroceryItem {
    @Override
    public String getName() {
        return "Grocery Name";
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal("3.5");
    }

    @Override
    public String getStoreName() {
        return "Store Name";
    }
}
