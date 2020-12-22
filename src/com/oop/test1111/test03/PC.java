package com.oop.test1111.test03;

public class PC implements Interque {
    @Override
    public void goOnline(WebSite webSite) {
        System.out.println("使用Pc端上网：");
        webSite.showInfo();
    }
}
