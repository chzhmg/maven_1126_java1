package com.oop.test1112.test02;

public class Stone implements ITool {
    @Override
    public void knock(INut nut) {
       String ej= nut.effect();
        System.out.println("使用石头开坚果:"+ej);

    }
}
