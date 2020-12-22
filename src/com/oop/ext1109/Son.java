package com.oop.ext1109;

public class Son extends Fu {
    //重写父类的方法
    //方法重写(override):
    //1.有继承关系
    //2.子类定义与父类完全一致的方法，就构成了重写
    //方法名相同，参数相同，返回值一致，访问修饰符要高于父类的

    @Override
    public void house() {
        System.out.println("Son住新房子");
    }
}
