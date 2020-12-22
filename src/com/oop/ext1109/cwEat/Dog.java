package com.oop.ext1109.cwEat;

public class Dog extends Pet {

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println(this.color + "的" + this.name + "吃骨头");
    }
}
