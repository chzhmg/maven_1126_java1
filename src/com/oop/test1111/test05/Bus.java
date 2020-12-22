package com.oop.test1111.test05;


public class Bus extends Car{
    public Bus(String name,String color){
        super(name,color);
    }

    @Override
    public void run() {
        System.out.println(this.color+"的"+this.name+"去景点");

    }
}
