package com.oop.demo1213.demo2;

public class Demo5 {
    public static void main(String[] args) {
        int eCount = 0;
        int dCount = 0;
        int chCount = 0;
        String str = "我是来自北方的小陈19019010919zbasdfa";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' & c <= '9') {
                dCount++;
            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                eCount++;
            } else {
                chCount++;
            }

        }
        System.out.println("英文 =》" + eCount + " 中文=》" + chCount + " 数字=》" + dCount);
    }
}
