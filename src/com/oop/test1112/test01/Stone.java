package com.oop.test1112.test01;

public class Stone implements ITools {
    @Override
    public void kjGuo(IJianguo jianguo) {
        System.out.println("使用石头开坚果");
        jianguo.eat();
    }
}
