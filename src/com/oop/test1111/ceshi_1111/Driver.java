package com.oop.test1111.ceshi_1111;

public class Driver {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public Driver(String name, int age) throws Exception {
        this.setName(name);
        this.setAge(age);

    }

    public void setAge(int age) throws Exception {
        if (age < 0 || age > 200) {
            throw new Exception("年龄设置不合法，无法设置");
        } else if (age < 18) {
            this.age = 18;
        } else {
            this.age = age;
        }

    }

    public void drive(Car car) {
        System.out.println(this.age + "岁的" + this.getName() + "的开车");
        car.run();
    }
}
