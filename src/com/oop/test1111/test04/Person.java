package com.oop.test1111.test04;

public class Person {
    //人的属性
    private String name;
    //
    private IFengjing fj;

    private Car car;

    public void setFj(IFengjing fj) {
        this.fj = fj;
    }

    //去看风景的方法
    public void goLook(Car car) {
        System.out.println(this.name + "去旅行");
        //   this.fj.lookScenery();
        car.drive(fj);
    }

    public Person(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
