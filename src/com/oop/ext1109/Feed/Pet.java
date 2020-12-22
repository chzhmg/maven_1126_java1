package com.oop.ext1109.Feed;

public abstract class Pet {
    //抽象类的特征
    //1.抽象类不能创建对象
    // 2.抽象类可以有构造方法，可以被子类调用
    //3.抽象类可以由抽象方法，也可以有非抽象方法
    //4.抽象类需要定义类时添加 关键字abstract

    //抽象方法
    //1.只能在抽象方法中定义
    // 2.不能有方法体
    //3.在定义方法时添加关键字 abstract

    //动物的属性
    public String name;
    public String color;

    public Pet(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void eat();
}
