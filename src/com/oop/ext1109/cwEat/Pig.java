package com.oop.ext1109.cwEat;

public class Pig  extends Pet {
    public Pig(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println(this.name+"吃猪饲料");
    }
}
