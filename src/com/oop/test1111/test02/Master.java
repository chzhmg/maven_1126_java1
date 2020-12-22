package com.oop.test1111.test02;

public class Master {
    //属性
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private IPrint iPrint;
    private IShowInfo iShowInfo;

    public void setiPrint(IPrint iPrint) {
        this.iPrint = iPrint;
    }

    public void see(IShowInfo iShowInfo) {
        System.out.println(this.name + ":富豪打印自己的财产信息:");
        this.iPrint.print(iShowInfo);

    }
}
