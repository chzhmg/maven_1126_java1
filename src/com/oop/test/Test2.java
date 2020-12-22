package com.oop.test;

public class Test2 {
    public void demo(String str) {
        //在字符串中删除某个字符或子字符串
        String[] arr = str.split(";");
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
     /*   char array[] = {'a', 'b', ' ', 'c', 'd', ';', 'e', 'f', ' ',
                'g', 'h', ';', 'i', 'j', ' ', 'k', 'l'};
        //转字符 将char 类型的 转换成 字符串类型的
        String str = new String(array);//"ab cd;ef gh;ij kl"
        System.out.println(str);
        Test2 t2 = new Test2();
        t2.demo(str);
*/
        String s1 = new String("chen");
        String s2 = new String("chen");
        //不同的两个对象 地址也不相同
        //两字符串完全相等的 hashCode值也相等
        //不同对象的两个相同的字符串 使用 s1.equals(s2) 也相等
        System.out.println("hashCode值:" + s1.hashCode());
        System.out.println("hashCode值:" + s2.hashCode());
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        String s3 = "chen";

        System.out.println("小写字母转大写时，不会改变原来的字符串（只转变不修改）" + s3.toUpperCase());
        String s4 = "yalun";
        s3 += s4;
        System.out.println(s3);
        System.out.println(s3.charAt(3));
        System.out.println(s3.substring(1, 3));

    }
}
