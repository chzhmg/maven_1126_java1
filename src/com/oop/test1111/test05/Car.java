package com.oop.test1111.test05;

public abstract class Car {
    protected String name;
    protected String color;
    public Car(String name,String color){
        this.name=name;
        this.color=color;
    }
public abstract void run();
}
