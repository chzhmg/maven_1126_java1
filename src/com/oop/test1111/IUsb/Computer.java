package com.oop.test1111.IUsb;

public class Computer {
    private IUsb iUsb1;
    private IUsb iUsb2;

    public void start() {
        System.out.println("电脑已启动。。。。");
        this.iUsb1.work();
        this.iUsb2.work();
    }

    public void setiUsb1(IUsb usb) {
        this.iUsb1 = usb;

    }

    public void setiUsb2(IUsb usb) {
        this.iUsb2 = usb;
    }
}
