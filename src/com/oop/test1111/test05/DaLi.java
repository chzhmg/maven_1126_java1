package com.oop.test1111.test05;

public class DaLi implements IFengguang{
    @Override
    public void accessCar(Car car) {
        System.out.println("去云南大理游玩");
        car.run();
    }
}
