package com.oop.test;

public class Test3 {
    public static void main(String[] args) {
        char[] ch = {'d', 'f', 'h','i','l'};
        String s = "abc";
        if (ch.length < s.length()) {
            System.out.println("----");
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
            System.out.println(ch[i]);

        }
        System.out.println(ch);
    }
}
