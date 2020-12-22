package com.oop.test1112.test07;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        System.out.println("--------------set--------------");
        Set set = new HashSet();
        set.add(121);
        set.add(12.3);
        set.add(true);
        set.add("qqq");
        set.add(121);
        set.add("qqq");
        set.add(121);
        System.out.println(set.size());
        System.out.println(set.contains("aaa"));
        System.out.println("=======================");
        //创建两个对象
        Student s1 = new Student("小明", "男");
        Student s2 = new Student("小明", "男");
        set.add(s1);
        set.add(s2);
        System.out.println(set);

    }
}
