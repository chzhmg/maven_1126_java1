package com.oop.demo1213.demo2;

public class Demo4 {
    public static void main(String[] args) {
        int eCount = 0;
        int dCount = 0;
        int chCount = 0;
        String str = "中华人民共和国1949abcdsasdfa";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                dCount++;
            } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                eCount++;
            } else {
                chCount++;
            }
        }
        System.out.println("数字的个数:" + dCount + " 英文的个数:" + eCount + " 中文的个数:" + chCount);
    }
}
