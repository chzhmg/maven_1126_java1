package com.oop.test1111.test02;

public class Test {
    public static void main(String[] args) {
        //创建主人
        Master m = new Master();
        m.setName("小明");
        //创建财产信息
        IShowInfo plan = new Plan();
        IShowInfo car = new Car();
        IPrint color = new ColorPrint();
        //设置打印机型号
        m.setiPrint(color);
        //打印财产信息
        m.see(car);


    }
}
