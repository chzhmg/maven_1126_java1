package com.oop.test1116.test03;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyTest {
    int num;
    @Before
    public void before(){
        num=10;
        System.out.println("给num赋值:"+num);
    }
    @Test
    public void test1() {
        System.out.println("----test1-------");
        for (int i = 1; i <= 10; i++) {

            System.out.println(i);
        }
    }

    @Test
    public void test2() {
        System.out.println("--------test2----------");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

    }

    @Test
    public void test3() {
        System.out.println("----------test3--------");
        System.out.println(num/2);
    }

    @Test
    public void test4s() {
        System.out.println("-------test4----------");

    }
    //在所有测试方法之后都会执行一次
    @After
    public void after(){
        System.out.println("-----after----");
    }
    public static void   beforeClass(){
        System.out.println("-----beforeClass-----");
    }
}
