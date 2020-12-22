package com.oop.test1116.test01;

import java.util.*;

public class Test2 {


    public static void main(String[] args) {
        Student s1 = new Student("张胜男1", "女");
        Student s2 = new Student("张胜男2", "女");
        Student s3 = new Student("张胜男3", "女");
        List list = new ArrayList();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---------------2");
        for (Object obj : list
                ) {
            System.out.println(obj);
        }
        System.out.println("---3");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Set set = new HashSet();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        for (Object val : set
                ) {
            System.out.println(val);
        }
        Iterator it1 = set.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        Map map = new HashMap();
        map.put(s1.getName(), s1);
        map.put(s2.getName(), s2);
        map.put(s3.getName(), s3);
        for (Object key : map.keySet()
                ) {
            System.out.println(key + "----->" + map.get(key));
        }

    }
}
