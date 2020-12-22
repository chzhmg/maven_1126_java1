package com.oop.test1116.test02;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test03 {
    @Test
    public void test() {
        List<Student> list = new ArrayList<Student>();
        //创建map集合
        Map<String, String> map = new HashMap<String, String>();
        Student s1 = new Student("小明", "男", "AAA03");
        Student s2 = new Student("李明", "男", "AAA01");
        Student s3 = new Student("陈亚伦", "男", "AAA02");
        Student s4 = new Student("陈晓华", "男", "AAA01");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        //遍历list集合
        for (Student student : list) {
            String stuName = student.getName();
            String clsName = student.getClassName();
            if (map.containsKey(clsName)) {
                //map集合中存在某个班级的名称
                //重新吧这个班级名称从map集合中取出
                String stus = map.get(clsName);
                stus = stus + "," + stuName;
                //拼接后重新 存入map中
                map.put(clsName, stus);


            } else {
                //不存在班级的名称，在直接存入map集合中
                map.put(clsName,stuName);
            }
        }
        //然后遍历map集合
        for (String key:map.keySet()
             ) {
            System.out.println(map.get(key)+"-------->"+key);
        }

    }
}
