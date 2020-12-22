package com.oop.test1111.ceshi_1111;

public class Bus extends Car {
    public int maxNum;

    @Override
    public void run() {
        System.out.println("开" + this.color + "的" + this.name + "(最大载客量:" + this.maxNum + ")"
                + "公共汽车开往下一站");
    }

    public Bus(String name, String color, Integer maxNum) {
        super(name, color);
        this.maxNum = maxNum;
    }

}
