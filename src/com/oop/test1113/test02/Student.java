package com.oop.test1113.test02;

import java.util.Objects;

public class Student {
    public String name;
    public String sex;

    public Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public int hashCode() {
        System.out.println("调用：Student hashCode");
        return Objects.hash(this.name, this.sex);
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("调用：Student equals");
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        //向下转型
        Student s = (Student) obj;
        if (this.sex.equals(s.sex) && this.name.equals(s.name)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
