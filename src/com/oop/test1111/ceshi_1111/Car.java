package com.oop.test1111.ceshi_1111;

public abstract class Car {
    public String name;
    public String color;

    public abstract void run();

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
