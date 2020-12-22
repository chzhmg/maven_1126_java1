package com.oop.ext1109.cwEat;

public abstract class Pet {
    //属性
    public String name;
    public String color;

    public Pet(String name, String color) {
        this.name = name;
        this.color = color;
    }


    //抽象方法，不用具体实现
    public abstract void eat();


}
