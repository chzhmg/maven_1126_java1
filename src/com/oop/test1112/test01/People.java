package com.oop.test1112.test01;

public class People {
    private String name;
    private IJianguo jianguo;

    public void setJianguo(IJianguo jianguo) {
        this.jianguo = jianguo;
    }

    public People(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void goEat(ITools tools) {
        System.out.println(this.name + "吃坚果:");
        tools.kjGuo(jianguo);
    }
}
