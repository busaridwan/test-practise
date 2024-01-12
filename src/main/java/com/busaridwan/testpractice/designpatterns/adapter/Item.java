package com.busaridwan.testpractice.designpatterns.adapter;

import java.math.BigDecimal;

public interface Item {
    String getItemName();
    BigDecimal getPrice();
    String getRestaurantName();
}
