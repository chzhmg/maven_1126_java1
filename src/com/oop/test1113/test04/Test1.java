package com.oop.test1113.test04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        //声明一个ArrayList
        List list = new ArrayList();
        Map map = new HashMap();
        map.put("name", "小明");
        map.put("sex", "男");
        map.put("age", 19);
        list.add(map);
        Student s1 = new Student();
        s1.setAge(12);
        s1.setName("小明");
        s1.setSex("女");
        list.add(s1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
