package com.oop.demo1213.demo4;

public class SingleTonTest3 {
    private final static SingleTonTest3 instacnce =
            new SingleTonTest3();

    private SingleTonTest3() {
    }

    public static SingleTonTest3 getInstacnce() {
        return instacnce;
    }
}

class SingleTonTest4 {
    private static SingleTonTest4 instance = null;

    private SingleTonTest4() {
    }

    public static synchronized SingleTonTest4 getInstance() {
        if (instance == null) {
            instance = new SingleTonTest4();
        }
        return instance;
    }

}
