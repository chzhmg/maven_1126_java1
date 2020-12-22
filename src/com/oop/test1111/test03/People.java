package com.oop.test1111.test03;

public class People {
    //属性
    private String name;
    //上网设备
    private Interque interque;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInterque(Interque interque) {

        this.interque = interque;
    }

    public void goToOnline(WebSite webSite) {
        System.out.println(this.name+"上网:");
        this.interque.goOnline(webSite);
    }
}
