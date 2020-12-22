package com.oop.test1111.test01;

public class Master {
    //属性

    private String name;
    //
    private Printer printer = new Printer();
  //  private  IShowInfo showInfo;

    public Master(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Print(IShowInfo showInfo) {
        System.out.println("富豪：" + this.name + "查看自己的私有财产:");
        this.printer.print(showInfo);

    }
}
