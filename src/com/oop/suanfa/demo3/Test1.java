package com.oop.suanfa.demo3;

public class Test1 {
    public static void main(String[] args) {


        String str = "阿松大afasdf阿斯顿发射点123";
        int eCount = 0;
        int chCont = 0;
        int dCount = 0;
        int itCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                dCount++;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                eCount++;
            } else {
                chCont++;
            }
        }
        System.out.println("..............");
        System.out.println(eCount + " " + chCont + " " + dCount + " ");
    }
}
