package com.oop.test1112.test04;

public class Test01 {
    public static void main(String[] args) {
        //基本类型的包装类

        //int ——》Integer
        //char  ——》 Character
        //double  ——》Double
        //float ——》Float
        //boolean ——》 Boolean

        int number;
        Integer Number = null;
        System.out.println("Integer 最小值" + Integer.MIN_VALUE);
        System.out.println("Integer 最大值" + Integer.MAX_VALUE);
        //包装类有特定的方法
        int num1 = Integer.max(100, 1231);
        System.out.println(num1);
        //包装类可以进行数据类型的转换
        String a = "123234";
        int b = Integer.parseInt(a);
        System.out.println("将字符串a的类型转换为int类型: b=" + b);
        //将基本类型转成包装类
        int num2 = 100;
        Integer num3 = Integer.valueOf(num2);
        System.out.println("转换成包装类:" + num3);

        double d1 = 12.12;
        Double d2 = Double.valueOf(d1);
        System.out.println(d2);
        String d3 = "12312.12";
        double d4 = Double.valueOf(d3);
        double d5 = Double.parseDouble(d3);
        System.out.println(d4);
        System.out.println(d5);
    }
}
