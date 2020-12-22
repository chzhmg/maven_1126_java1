package com.oop.test1120.test02;

public class Test {

    public void test() {

        System.out.println("这是无参方法");
    }

    public void test(int number) {
        System.out.println("这个有参方法 number:" + number);
    }

    public void test(int number, int number1) {
        System.out.println(number + number1);
    }

    public void test(int number, String name) {
        System.out.println("这个有参方法 number:" + number + " name:" + name);
    }

    public void test(int number, String name, String sex) {
        System.out.println("这个有参方法 number:" + number + " name:" + name);
    }

    public void test(String name, int number, String sex) {
        System.out.println("这个有参方法 number:" + number + " name:" + name);
    }
}


