package com.oop.test1111.test05;

public class Taxi extends Car{
    public Taxi(String name,String color){
        super(name,color);
    }
    public void run(){
        System.out.println(this.color+"的"+this.name+"去景点");
    }
}
