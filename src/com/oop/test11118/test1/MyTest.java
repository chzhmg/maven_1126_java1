package com.oop.test11118.test1;

import org.junit.Test;

public class MyTest {
    @Test
    public void test() {
        System.out.println();

    }

    public int number = 1;
    public static int number2 = 1;

    public MyTest() {
        System.out.println("实例变量:" + number++);
        System.out.println("静态变量：" + number2++);
    }

    public static void main(String[] args) {
        MyTest m1 = new MyTest();
        System.out.println("-------------------");
        MyTest m2 = new MyTest();


    }
}
