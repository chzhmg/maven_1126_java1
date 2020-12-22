package com.oop.test1111.IUsb;

//鼠标实现usbI接口中的方法
public class Mouse implements IUsb {

    @Override
    public void work() {
        System.out.println("使用鼠标操作电脑....");
    }
}
