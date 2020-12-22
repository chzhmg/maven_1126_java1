package com.oop.test1111.test06;

public class Test {
    public static void main(String[] args) {
        //创建人物
        Person p = new Person("小明");
        //创建工具
        ITools pliers = new Pliers();
        //创建坚果
        INuts walnut = new Walnut();
        p.setNuts(walnut);
        //去吃坚果
        p.goEat(pliers);
    }
}
