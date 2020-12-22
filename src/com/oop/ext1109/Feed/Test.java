package com.oop.ext1109.Feed;

public class Test {
    public static void main(String[] args) {
        //创建主人
        Master  m = new Master("小华");
        //创建动物
        Pet p  = new Pig("八戒","黑色");
        m.feed(p);
    }
}
