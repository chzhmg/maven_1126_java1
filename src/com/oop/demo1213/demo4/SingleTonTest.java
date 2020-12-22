package com.oop.demo1213.demo4;

public class SingleTonTest {
    private final static SingleTonTest instance = new
            SingleTonTest();

    private SingleTonTest() {
    }

    public static SingleTonTest getInstance() {
        return instance;
    }
}

class SingleTonTest1 {
    private static SingleTonTest1 instance = null;

    public static synchronized SingleTonTest1 getInstance() {
        if (instance == null) {
            instance = new SingleTonTest1();
        }
        return instance;
    }
}
