package com.oop.test1111.test06;

public class Pliers implements  ITools {
    @Override
    public void use(INuts iNuts) {
        System.out.println("使用钳子开坚果:");
        iNuts.eat();
    }
}
