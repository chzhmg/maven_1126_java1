package com.oop.test1111.test06;

import java.time.Period;

public class Person {
    //属性
    private String name;

     private INuts nuts;

    public Person(String name) {
        this.setName(name);
    }

    public void setNuts(INuts nuts) {
        this.nuts = nuts;
    }


    public void goEat(ITools tools) {
        System.out.println("去吃坚果的" + this.name);
        tools.use(nuts);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
