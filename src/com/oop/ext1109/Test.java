package com.oop.ext1109;

public class Test {
    public static void main(String[] args) {
        Fu f = new Fu();
        f.house();

        Son s = new Son();
        System.out.println("Son有"+s.money+"万元");
        s.house();
    }
}
