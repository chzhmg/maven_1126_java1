package com.oop.test1214.test2;

public class Demo2 {

    public static void main(String[] args) {
//        int age = test1(8);
//        int age =test2(8);
//        int age = test3(8);
//        int age = test4(8);
        int age = test5(8);
        System.out.println("第8个人的年龄为:" + age);
    }

    public static int test1(int n) {
        if (n == 1) {
            return 10;
        }
        return test1(n - 1) + 2;
    }

    public static int test2(int n) {
        if (n == 1)
            return 10;
        return test2(n - 1) + 2;
    }

    public static int test3(int n) {
        if (n == 1)
            return 10;
        return test3(n - 1) + 2;
    }

    public static int test4(int n) {
        if (n == 1)
            return 10;
        return test4(n - 1) + 2;
    }

    public static int test5(int n) {
        if (n == 1)
            return 10;
        return test5(n - 1) + 2;
    }
}
