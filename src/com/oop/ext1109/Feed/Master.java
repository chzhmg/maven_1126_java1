package com.oop.ext1109.Feed;

public class Master {
    //主人的属性
    public String name;

    public Master(String name) {
        this.name = name;
    }

    public void feed(Pet pet) {
        System.out.println("主人" + this.name + "喂养宠物");
        pet.eat();
    }
}
