package com.oop.test1112.test07;

public class Student {
    private String name;
    private String sex;

    public Student(String name, String sex) {
        this.name = name;
        this.sex = sex;

    }

    public void show() {
        System.out.println(this.name);
    }

    //重写Object 类的equals方法
/*
    @Override
    public boolean equals(Object obj) {
        //先判断两个对象的地址是否一致
        if (this == obj) {
            return true;
        }
        //判断比较的目标对象是否是学生对象，如果不是直接返回false
        if (!(obj instanceof Student)) {
            return false;

        }
        //如果目标对象是学生对象,则向下转型为学生对象
        Student s = (Student) obj;
        //比较数据内容是否相等
        if (this.name.equals(s.name)) {
            return true;
        }

        return false;
    }
    */

    @Override
    public int hashCode() {
        //如果名字和性别一样，则hashCode也一样
        return  this.name.hashCode()+this.sex.hashCode();

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student s = (Student) obj;
        if (s.name.equals(this.name) && s.sex.equals(this.sex)) {
            return true;
        }
        return false;
    }


//重写Object的toString方法

    @Override
    public String toString() {

        return "姓名:" + this.name + "  性别:" + this.sex;
    }
    //重写

}
