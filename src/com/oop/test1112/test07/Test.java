package com.oop.test1112.test07;

import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        //创建数组的方式，有以下三种
        //数组的最大下标 = 数组的长度-1，下标从零开始
        // 数组下标的范围为[0,array.length-1]
        //第一种 声明数组的长度 ，默认值都为null
        String[] str = new String[10];
        //第二种 ,直接为数组 赋值
        String[] str1 = new String[]{"张三", "李四", "王五", "小陈"};
        //第三种 直接为数组赋值
        String[] str2 = {"aaa", "bbb", "ccc", "ddd"};
        //length是获取数组的长度的方法
        System.out.println(str.length);
        System.out.println(str2.length);
        for (int i = 0; i < str2.length; i++) {
            System.out.print(str2[i] + " ");
        }
        System.out.println("-----------");
        for (String s : str) {
            System.out.println(s);
        }
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }


    }
}
