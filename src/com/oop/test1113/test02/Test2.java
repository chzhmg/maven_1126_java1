package com.oop.test1113.test02;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student("小明", "男");
        Student s2 = new Student("小明", "男");
        Student s3 = new Student("小明", "女");
        Map map = new HashMap();
     /*   map.put(s1, "s1");
        map.put(s1, "s2");*/

        //key相同 val不相同 时，

        map.put(s1, "s1");
        map.put(s3, "s2");





        //key相同 val相同时
        //key不相同,val相同时
        System.out.println("遍历map集合");
        for (Object key : map.keySet()) {
            System.out.println("key="+key + "  value=" + map.get(key));
        }
    }
}

