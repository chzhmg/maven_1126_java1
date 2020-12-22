package com.oop.test1111.test05;

public class TaiShan implements IFengguang{
    @Override
    public void accessCar(Car car) {
        System.out.println("去泰山看风景");
        car.run();
    }
}
