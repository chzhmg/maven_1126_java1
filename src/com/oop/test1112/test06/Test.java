package com.oop.test1112.test06;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("小明", "男");
        Student s2 = new Student("小明", "男");

//        System.out.println(s1.equals(s2));
//        System.out.println("s1的hashCode:"+s1.hashCode());
//        System.out.println("s2的hashCode:"+s2.hashCode());

        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("-------------");
        String s3 = "asdfa";
        //调用的是Student类中重写的toString()方法
        System.out.println(s3.toString());
        //==判断的是内存地址是否一致
        System.out.println(s1.toString()==s2.toString());
        //返回的是相应的数据字符串，不是返回内存地址
        System.out.println(s2.toString());
    }
}
