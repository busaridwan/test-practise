package com.busaridwan.testpractice.designpatterns.adapter;

import java.math.BigDecimal;

public class GroceryItemAdapter implements Item {

    private GroceryItem groceryItem;

    public GroceryItemAdapter(GroceryItem groceryItem) {
        this.groceryItem = groceryItem;
    }

    @Override
    public String getItemName() {
        return groceryItem.getName();
    }

    @Override
    public BigDecimal getPrice() {
        return groceryItem.getPrice();
    }

    @Override
    public String getRestaurantName() {
        return groceryItem.getStoreName();
    }
}
