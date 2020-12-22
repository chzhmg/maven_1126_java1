package com.oop.test1111.test04;

public class Test {

    public static void main(String[] args) {
        //创建人物
        Person p = new Person("小明");
        //创建车子
        Car taxi = new Taxi();

        //创建景点
        IFengjing dali = new DaLi();
        //设置景点
        p.setFj(dali);
        p.goLook(taxi);
    }
}
