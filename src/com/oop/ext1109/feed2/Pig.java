package com.oop.ext1109.feed2;

public class Pig extends Pet {
    public Pig(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println(this.color + "的" + this.name + "吃猪饲料");

    }
}
