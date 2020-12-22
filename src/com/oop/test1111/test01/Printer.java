package com.oop.test1111.test01;

public class Printer {
    public void print(IShowInfo show) {
        //调用财产对象的info方法，返回财产的描述信息
        String res = show.info();
        System.out.println("使用打印机打印财产:" + res);
    }
}
