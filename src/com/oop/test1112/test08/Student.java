package com.oop.test1112.test08;

public class Student {

    private String name;
    private String sex;

    public Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "姓名:" + this.name + " 性别:" + this.sex;
    }
    //重写hashCode方法

    @Override
    public int hashCode() {
        System.out.println("调用Student的hashCode方法");
        return this.sex.hashCode() + this.sex.hashCode();
    }

    //重写equals方法

    @Override
    public boolean equals(Object obj) {
        System.out.println("调用Student里的equals方法");
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        if (this.name.equals(this.name) && this.sex.equals(this.sex)) {
            return true;
        }
        return false;
    }
}
