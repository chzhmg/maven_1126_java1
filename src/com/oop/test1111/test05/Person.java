package com.oop.test1111.test05;

public class Person {
    private String name;
    public IFengguang f;

    public Person(String name){
        this.name=name;
    }
    public void look(Car c){
        System.out.println(this.name+"去游玩");
        this.f.accessCar(c);
    }

    public void setF(IFengguang f) {
        this.f = f;
    }
}
