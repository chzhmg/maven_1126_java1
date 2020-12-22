package com.oop.ext1109.cwEat;

public class Test {
    public static void main(String[] args) {
        //创建一个主人
        Master m = new Master();
        m.name = "小明";
        //创建小动物
        //向上转型
        Pet dog = new Dog("小黄", "黄色");
        Pet cat = new Cat("小花", "白色");
        //向下转型
        Pet c = (Cat) cat;
        m.feed(dog);
        System.out.println("------");
        m.feed(c);
        System.out.println("---");
        Pig pig = new Pig("小黑", "黑色");
        Pig p2 = new Pig("小崽崽", "花色");
        m.feed(pig);
        System.out.println("----");
        m.feed(p2);
        //多态

    }
}
