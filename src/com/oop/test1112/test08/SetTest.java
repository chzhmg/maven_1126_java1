package com.oop.test1112.test08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        //声明Set
        Set set = new HashSet();
        //set 无序，不重复添加数据
        set.add(12);
        set.add(12.3);
        set.add("qeqw");
        set.add("qeqw");
        set.add(true);
        //创建对象
        Student s1 = new Student("小明", "男");
        Student s2 = new Student("小明", "男");
        set.add(s1);
        set.add(s2);
        //System.out.println(set);
        //使用迭代器遍历set
        Iterator it =  set.iterator();
        //hasNext 返回的是 true/false
        while (it.hasNext()){
            Object obj= it.next();
            System.out.println(obj);
         }



    }
}
