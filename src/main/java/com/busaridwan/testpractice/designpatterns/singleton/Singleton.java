package com.busaridwan.testpractice.designpatterns.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        // Private constructor to prevent external instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();  // Thread-safe lazy initialization
                }
            }
        }
        return instance;
    }

    // Other methods and fields of the singleton class
}