package com.oop.test1214.test1;

public class Demo2 {
    public static void main(String[] args) {
        test1(1997);
    }

    public static void test1(int number) {
        System.out.println(number);
        if (number <= 5000) {
            test1(number * 2);
            System.out.println(number);
        }

    }
}
