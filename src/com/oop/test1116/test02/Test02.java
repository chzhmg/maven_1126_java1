package com.oop.test1116.test02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test02 {
    public static void main(String[] args) {
        //
        List<Student> list = new ArrayList<Student>();
        Student s1 = new Student("小华2", "男", "a01");
        Student s2 = new Student("小华1", "女", "a02");
        Student s3 = new Student("小华3", "男", "a03");
        Student s4 = new Student("小华4", "女", "a04");
        Map<String, String> map = new HashMap<String, String>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        for (Student student : list) {
            String stuName = student.getName();
            String sex = student.getSex();
            if (map.containsKey(sex)) {
                String stus = map.get(sex);
                stus = stus + "," + student.getName();
                map.put(sex, stus);
            } else {
                map.put(sex, stuName);
            }


        }
        for (String key : map.keySet()
                ) {
            System.out.println(map.get(key) + "======>" + key);
        }
    }
}
