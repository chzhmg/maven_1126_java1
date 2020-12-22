package com.oop.demo1213.demo4;

public class SingleTonTest2 {
    private static final SingleTonTest2 instance = new
            SingleTonTest2();

    private SingleTonTest2() {
    }

    public static SingleTonTest2 getInstance() {
        return instance;
    }
}
