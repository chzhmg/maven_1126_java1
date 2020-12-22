package com.oop.ext1109.feed2;

public abstract class Pet {
    //抽象的类主要被子类继承进行实现不同的细节
    //抽象类 ：1.定义类时，添加关键字 abstract 2.不能创建对象3.可以被继承
    //抽象方法:1.定义方法时，添加关键字 abstract2.可以有返回值3.不能有方法体

    //属性
    public String name;
    public String color;

    //构造方法也可以构成重载


    public Pet(String name, String color) {
        this.name = name;
        this.color = color;

    }

    //抽象方法

    public abstract void eat();

}
