package com.oop.test1111.interRun;

public class Test {
    public static void main(String[] args) {
        System.out.println("世界末日来临...........");
        IRun rabbit = new Rabbit();
        rabbit.run();
        IRun car = new Car();
        car.run();
        IRun people = new People();
        people.run();
        IRun plan = new Plan();
        plan.run();
    }
}
