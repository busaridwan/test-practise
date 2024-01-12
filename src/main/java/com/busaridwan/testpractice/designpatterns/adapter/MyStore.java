package com.busaridwan.testpractice.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class MyStore {
    List<Item> items = new ArrayList<>();
    public void addItem(Item item){
        items.add(item);
    }
}
