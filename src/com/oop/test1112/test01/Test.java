package com.oop.test1112.test01;

public class Test {
    public static void main(String[] args) {
        People p =new People("小明");
        ITools chui= new ChuiZi();
        ITools s = new Stone();
        IJianguo hetao = new HeTao();
        IJianguo  xingren = new Xingren();
        p.setJianguo(hetao);
        p.goEat(chui);
        p.goEat(s);
        System.out.println("----------");
        p.setJianguo(xingren);
        p.goEat(s);

    }
}
