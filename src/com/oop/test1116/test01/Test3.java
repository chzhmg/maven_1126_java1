package com.oop.test1116.test01;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        //创建学生
        Student s1 = new Student("李明", "男");
        Student s2 = new Student("小华", "男");
        Student s3 = new Student("小黑", "男");
        list.add(s1);
        list.add(s3);
        list.add(s2);
        for (Student val : list
                ) {
            System.out.println(val);
        }
        System.out.println("----------------");
        Set<Student> set = new HashSet<Student>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        for (Student s : set) {
            System.out.println(s.getName() + "----" + s.getSex());
        }

        //  List<Map<String ,String >> list1  = new ArrayList<HashMap<String ,String>>;
        System.out.println("-------------------");
        List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();

        // 向map集合中添加数据
        map.put("name", "张三");
        map.put("sex", "男");
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("name", "小华");
        map1.put("sex", "男");
        //向list集合中添加数据
        list1.add(map);
        list1.add(map1);
        //for in 遍历集合中的数据
        for (Map<String, Object> map2 : list1) {
            System.out.println("==========");
            for (String key : map2.keySet()) {
                System.out.println(key + "---->" + map2.get(key));
            }

        }
        System.out.println("List嵌套Map");
        List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
        Map<String, Object> map2 = new HashMap<String, Object>();
        map2.put("name", "张三妮");
        map2.put("sex", "女");
        map2.put("classId", 1);
        mapList.add(map2);
        Map<String, Object> map3 = new HashMap<String, Object>();
        map3.put("name", "张二妮");
        map3.put("sex", "女");
        map3.put("classId", 2);
        mapList.add(map3);
        for (Map<String, Object> m1 : mapList) {
            System.out.println("============");
            for (String key : m1.keySet()) {
                System.out.println(key + "====>" + m1.get(key));
            }
        }
        System.out.println("---分两步骤--");
         for (int i = 0; i < mapList.size(); i++) {
            System.out.println("+++++");
            Map<String, Object>         m1 = mapList.get(i);
            for (String m : m1.keySet()
                    ) {
                System.out.println(m + "---->" + m1.get(m));
            }
        }


    }
}
