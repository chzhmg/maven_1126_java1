package com.oop.test1112.test02;

public class People {
    //名字
    private String name;
    //工具
    private ITool tool;

    public void setTool(ITool tool) {
        this.tool = tool;
    }

    //坚果接口
    private INut nut;
    //吃不同的坚果

    public void setNut(INut nut) {
        this.nut = nut;
    }

    public People(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name + "开始吃坚果:");
        tool.knock(nut);
    }
}
