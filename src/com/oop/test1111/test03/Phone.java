package com.oop.test1111.test03;

public class Phone implements Interque {
    @Override
    public void goOnline(WebSite webSite) {
        System.out.println("使用手机上网:");
        webSite.showInfo();
    }
}
