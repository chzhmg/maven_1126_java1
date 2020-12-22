package com.oop.test1111.test04;

public class Taxi implements Car {
    @Override
    public void drive(IFengjing fj) {
        System.out.println("开着出租车:");

        fj.lookScenery();
    }
}
