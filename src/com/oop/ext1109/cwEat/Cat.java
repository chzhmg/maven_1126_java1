package com.oop.ext1109.cwEat;

public class Cat extends Pet {


    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println(this.name+"吃小鱼");
    }
}
