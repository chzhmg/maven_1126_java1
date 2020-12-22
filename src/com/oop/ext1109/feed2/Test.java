package com.oop.ext1109.feed2;

public class Test {
    public static void main(String[] args) {
        //创建主人
        //多态：一种事物有不同的形态
        // 动物 :可以有多种动物
        Master m = new Master("小明");
        //创建动物
        //抽象类不能创建对象
        //Pet p = new Pet("小灰", "灰色"); 这种写法是错的

        Pet pig = new Pig("八戒", "黑色");
        //调用主人喂宠物的方法
        //不同的对象，喂不同的食物
        m.feed(pig);
        Pet cat = new Cat("小花", "白色");
        //调用主人喂宠物的方法
        m.feed(cat);


    }
}
