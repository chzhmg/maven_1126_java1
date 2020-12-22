package com.oop.ext1109.feed2;

public class Cat extends  Pet {
    public Cat(String name, String color) {
        super(name, color);
    }
    //重写:是在继承的基础上
    //重写父类的方法，实现不同的细节

    @Override
    public void eat() {
        System.out.println(this.color +"的"+this.name+"吃小鱼");
    }
}
