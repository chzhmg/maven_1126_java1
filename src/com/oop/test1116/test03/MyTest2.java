package com.oop.test1116.test03;

import org.junit.*;

public class MyTest2 {
    @Before
    public void before() {
        System.out.println("before 会在一个测试方法执行前执行");

    }

    @Test
    public void test1() {
        System.out.println("这是test1方法");

    }
    @Test
    public void test2(){
        System.out.println("这是test2方法");
    }
    @After
    public void after(){
        System.out.println("after方法 会在一个测试方法执行完成后执行");
    }
    @BeforeClass
    public   static   void beforeClass(){
        System.out.println("beforeClass 会在所有测试方法执行前执行");
    }
    @AfterClass
    public static  void AfterClass(){
        System.out.println("AfterClass 会在所有测试方法执行完成后执行");
    }

}
