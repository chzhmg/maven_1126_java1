package com.oop.test1111.test01;

public class Test {
    public static void main(String[] args) {
        //创建富豪
        Master master = new Master("小明");
        //创建车子
        IShowInfo car = new Car();
        //创建房子
        IShowInfo house = new House();
        //创建船
        IShowInfo Ship = new Ship();

        master.Print(car);
        master.Print(house);
        master.Print(Ship);

    }

}
