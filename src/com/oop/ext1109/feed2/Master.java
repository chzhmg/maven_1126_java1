package com.oop.ext1109.feed2;

import javax.swing.text.MaskFormatter;

public class Master {
    //属性
    public String name;

    public Master(String name) {
        this.name = name;
    }

    public void feed(Pet pet) {
        System.out.println(this.name+"喂宠物");
        pet.eat();
    }
}
