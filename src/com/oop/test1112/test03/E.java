package com.oop.test1112.test03;

public class E implements IA, IB, ID {

    //一个实现类可以实现多个类，同时必须实现接口的所有方法

    @Override
    public void test() {
        System.out.println("E test");
    }

    @Override
    public void D1() {
        System.out.println("E D1");
    }
}
