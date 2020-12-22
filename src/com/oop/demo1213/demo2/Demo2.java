package com.oop.demo1213.demo2;

public class Demo2 {
    public static void main(String[] args) {
        int chCount = 0;
        int eCount = 0;
        int dCount = 0;
        String str = "作战afsaasda23123fasfasfd小ing";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                dCount++;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                eCount++;
            } else {
                chCount++;
            }
        }
        System.out.println("中文的个数：" + chCount + " 英文的个数:" + eCount + " 数字的个数:" + dCount);

    }
}
