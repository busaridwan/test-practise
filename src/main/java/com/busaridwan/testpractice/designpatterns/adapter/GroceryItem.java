package com.busaridwan.testpractice.designpatterns.adapter;

import java.math.BigDecimal;

public interface GroceryItem {
    String getName();
    BigDecimal getPrice();
    String getStoreName();
}
