package com.oop.demo1213.demo2;

public class Demo3 {
    public static void main(String[] args) {
        int chCount = 0;
        int eCount = 0;
        int dCount = 0;
        String str = "小华去上学1212332adfaas2123dffa";
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
        System.out.println("中文的字数:" + chCount + " 数字的个数:" + dCount + " 英文的字数" + eCount);
    }
}
