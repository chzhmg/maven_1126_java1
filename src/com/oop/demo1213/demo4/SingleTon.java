package com.oop.demo1213.demo4;

public class SingleTon {
    private final static SingleTon instance = new SingleTon();

    private SingleTon() {
    }

    public static SingleTon getInstance() {
        return instance;
    }


}

class SingleTons {
    private static SingleTons instance = null;

    private SingleTons() {
    }

    public static synchronized SingleTons getInstance() {
        if (instance == null) {
            instance = new SingleTons();
        }
        return instance;
    }

}
