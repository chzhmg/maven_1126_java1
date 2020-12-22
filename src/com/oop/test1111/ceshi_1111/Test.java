package com.oop.test1111.ceshi_1111;

public class Test {
    public static void main(String[] args) throws Exception {
        Car bus = new Bus("公共汽车", "灰色", 35);
        Car t = new Taxi("出租车", "蓝色", "河南出租车公司");
        Driver d = new Driver("小白", 19);
       /* d.setAge(33);
        d.setName("小明");*/
        d.drive(bus);
        d.drive(t);
    }
}
