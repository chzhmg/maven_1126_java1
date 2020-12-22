package com.oop.suanfa.demo3;

public class Test2 {
    public static void main(String[] args) {
        String str = "张三1212absfasd";
        Test2 t = new Test2();
        
        //统计英文的字数
        int eCount = 0;
        //统计中文的个数
        int chCont = 0;
        //统计数字的个数
        int digitCount = 0;
        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                eCount++;
            } else if (ch >= '0' && ch <= '9') {
                digitCount++;
            } else {
                chCont++;
            }
        }
        System.out.println("英文个数:" + eCount + " 中文字数：" + chCont + " 数字个数:" + digitCount);
    }
}
