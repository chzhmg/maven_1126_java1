package com.oop.test;

public class Test {


    public static void swap(Integer i, Integer j) {
        Integer temp = new Integer(i);
        System.out.println("temp=" + temp);
        i = j;//i=20
        j = temp;//j=10
        System.out.println("i=" + i);
        System.out.println("j=" + j);
    }

    public static void main(String[] args) {
   /* //    Integer i = new Integer(10);// =10
     //   Integer j = new Integer(20);// =20
        int i=11;
        int j=22;
        swap(i, j);
        System.out.println("i = " + i + ", j = " + j);
        */

    }
//在方法中不能直接(传递的参数赋值)为未定义的变量进行赋值
    //static int fun(x=10) {
    //  return x;
    //}
}
