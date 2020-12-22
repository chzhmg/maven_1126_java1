package com.oop.demo1213.demo2;

public class demo1 {
    //统计英文的字数
    int eCount;
    //统计数字的 字数
    int dCount;
    //统计中文的字数
    int chCount;

    public static void main(String[] args) {
        demo1 d = new demo1();
        String str = "张三asdfaa李四1e423w345898q";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                d.eCount++;
            } else if (ch >= '0' && ch <= '9') {
                d.dCount++;
            } else {
                d.chCount++;
            }

        }
        System.out.println("英文的字数 " + d.eCount + " 中文的字数 " + d.chCount + " 数字的个数 " + d.dCount);
    }
}
