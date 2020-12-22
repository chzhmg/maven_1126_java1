package com.oop.demo1213.demo4;

public class SingleTon2 {
    private final static SingleTon2 instance =
            new SingleTon2();

    private SingleTon2() {
    }

    public static SingleTon2 getInstance() {
        return instance;
    }

}

class SingleTon3 {
    private static SingleTon3 instance = null;

    private SingleTon3() {
    }

    public static synchronized SingleTon3 getInstance() {
        if (instance == null) {
            instance = new SingleTon3();
        }
        return instance;
    }
}