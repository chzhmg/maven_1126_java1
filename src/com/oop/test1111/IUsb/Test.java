package com.oop.test1111.IUsb;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        IUsb usb1 = new Keyboard();
        IUsb usb2 = new Mouse();
        computer.setiUsb1(usb1);
        computer.setiUsb2(usb2);
        computer.start();
        //接口:是一种规范，是一种行为标准
        //接口可以继承接口，接口可以继承
        //接口:接口中的方法都是公有的抽象的方法
        //在接口中，定义的属性都是静态常量
        //方法没有方法体
    }
}
