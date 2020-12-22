package com.oop.overload_1109;

public class Calc {
    //方法重载：
    //1.方法名相同 2.参数不同（参数类型，参数位置，参数个数）
    //3.与返回值类型无关

    //方法重载

    public static void add(int a, int b) {
        System.out.println(a + b);

    }

    public static void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void add(int num, String str) {
        System.out.println(num + str);

    }

}
