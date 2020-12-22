package com.oop.ext1109.xiawu;

public class Test {
    public static void main(String[] args) {
        Son s = new Son("张");
        //s.say();
        Fu f = new Son("张");
        Son f1 = (Son) f;
        f1.say();


    }
}
