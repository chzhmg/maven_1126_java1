package com.oop.test1112.test02;

public class Test {
    public static void main(String[] args) {
        //创建人物
        People p = new People("小兰");
        //创建工具
        ITool stone = new Stone();
        ITool hammer = new Hammer();
        //创建坚果
        INut almond = new Almond();
        INut walnut = new Walnut();
        //使用不同的工具开坚果
        p.setTool(stone);
        // 吃不同的坚果
        p.setNut(almond);
        //吃坚果
        p.eat();
    }
}
