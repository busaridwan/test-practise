package com.busaridwan.testpractice.designpatterns.adapter;

public class Main {
    public static void main(String[] args) {
        MyStore myStore = new MyStore();
        myStore.addItem(new FoodItem());
        myStore.addItem(new GroceryItemAdapter(new GroceryProduct()));
    }
}
