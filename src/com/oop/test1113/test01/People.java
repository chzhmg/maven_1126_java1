package com.oop.test1113.test01;

public class People {
    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }



    @Override
    public boolean equals(Object obj) {
        System.out.println("调用方法");
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof People)) {

            return false;
        }
        People p = (People) obj;
        if (this.sex.equals(p.sex) && this.name.equals(p.name)) {
            return true;

        }
        return false;
    }
    @Override
    public String toString() {
        return "姓名:" + this.name + "性别:" + this.sex;
    }
}
