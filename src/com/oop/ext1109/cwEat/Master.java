package com.oop.ext1109.cwEat;

public class Master {
    //属性
    public String name;


    //主人喂养小动物
    public void feed(Pet pet) {
        System.out.println(this.name + "喂养"+pet.name);
        pet.eat();
    }

    ;
}
