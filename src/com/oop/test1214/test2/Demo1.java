package com.oop.test1214.test2;

public class Demo1 {
    public static void main(String[] args) {
//        test1(1231);
        // test2(2444);
//        test3(1234);
//        test4(1556);
        test5(1266);
    }

    public static void test1(int number) {
        System.out.println(number);
        if (number <= 5000) {
            test1(number * 2);
            System.out.println(number);
        }
    }

    public static void test2(int number) {
        System.out.println(number);
        if (number <= 5000) {
            test2(number * 2);
            System.out.println(number);
        }
    }

    public static void test3(int number) {
        System.out.println(number);
        if (number <= 5000) {
            test3(number * 2);
            System.out.println(number);
        }
    }

    public static void test4(int number) {
        System.out.println(number);
        if (number <= 5000) {
            test4(number * 2);
            System.out.println(number);
        }
    }

    public static void test5(int number) {
        System.out.println(number);
        if (number <= 5000) {

            test5(number * 2);
            System.out.println(number);
        }
    }
}
