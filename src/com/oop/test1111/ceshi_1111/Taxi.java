package com.oop.test1111.ceshi_1111;

public class Taxi extends Car {
    public String company;

    @Override
    public void run() {
        System.out.println("(所属公司为：" + this.company + ")" + "的" + this.color + "的" + this.name + "出租车,将客人拉往目的地");
    }

    public Taxi(String name, String color, String company) {
        super(name, color);
        this.company = company;
    }
}
