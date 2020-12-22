package com.oop.test1112.test02;

public class Hammer implements ITool {

    @Override
    public void knock(INut nut) {

        String ej=  nut.effect();
        System.out.println("使用锤子开坚果:"+ej);
    }
}
