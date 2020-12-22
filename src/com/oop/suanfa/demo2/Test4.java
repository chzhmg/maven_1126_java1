package com.oop.suanfa.demo2;

import java.io.UnsupportedEncodingException;

public class Test4 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "我ABC";
        int num = trimGBK(str.getBytes("GBK"), 5);
        System.out.println(str.substring(0, num));
    }

    private static int trimGBK(byte[] buf, int n) {
        int num = 0;
        boolean bCh = false;
        for (int i = 0; i < n; i++) {
            if (buf[i] < 0 && !bCh) {
                bCh = true;
            } else {
                num++;
                bCh = false;
            }
        }
        return num;
    }
}
