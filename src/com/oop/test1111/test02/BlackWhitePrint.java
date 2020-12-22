package com.oop.test1111.test02;

public class BlackWhitePrint implements IPrint {
    @Override
    public void print(IShowInfo iShowInfo) {
        System.out.println("黑白打印机打印:");
        iShowInfo.info();
    }
}
