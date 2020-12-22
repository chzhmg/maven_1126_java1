package com.oop.test1112.test01;

public class ChuiZi implements ITools {
    @Override
    public void kjGuo(IJianguo jianguo) {
        System.out.println("使用锤子开坚果:");
        jianguo.eat();
    }
}
