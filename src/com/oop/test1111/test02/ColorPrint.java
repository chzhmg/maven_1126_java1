package com.oop.test1111.test02;

public class ColorPrint implements IPrint {

    @Override
    public void print(IShowInfo iShowInfo) {
        System.out.println("彩色打印机打印:");
        iShowInfo.info();
    }
}
