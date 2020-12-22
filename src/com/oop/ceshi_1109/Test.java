package com.oop.ceshi_1109;

import com.oop.ceshi_1109.President;

public class Test {
    public static void main(String[] args) {
        try {
            President p1 = new President("特朗普", -74);
            President p2 = new President("拜登", 77);
            p1.say();
            String isSc1 = p1.vote(190);
            System.out.println(isSc1);

            p2.say();
            String isSc2 = p2.vote(290);
            System.out.println(isSc2);
        }catch (Exception ex){
            System.out.println("出错了");
             ex.printStackTrace();

        }


    }
}
