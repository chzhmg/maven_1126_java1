package com.oop.test1111.test05;

public class Test {
    public static void main(String[] args) {
        Person s=new Person("张三");
        Car c1=new Bus("旅游巴士","绿色");
        Car c2=new Taxi("自驾游","白色");
        IFengguang i1=new TaiShan();
        IFengguang i2=new DaLi();
        s.setF(i1);
        s.look(c1);
        System.out.println("-------");
        s.setF(i2);
        s.look(c2);

    }
}
