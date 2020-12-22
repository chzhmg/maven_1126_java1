package com.oop.test1116.test02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        Map<String, String> map = new HashMap<String, String>();

        Student s1 = new Student("小华", "男", "AAA01");
        Student s2 = new Student("李华", "男", "AAA03");
        Student s3 = new Student("小明", "女", "AAA02");
        Student s4 = new Student("小林", "男", "AAA01");
        Student s5 = new Student("树哥", "男", "AAA04");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        for (Student student : list) {
            String clsName = student.getClassName();
            String stuName = student.getName();

            if (map.containsKey(clsName)) {
                //这个步骤是 重新取存的过程
                //重新声明一个变量，用于新旧的拼接
                String stus = map.get(clsName);//获取到已经存在map中的数据，根据key 获取value
                //重新拼接 学生姓名
                stus = stus + "," + student.getName();
                //重新向map中存
                map.put(clsName, stus);

            } else {
                map.put(clsName, stuName);
            }
        }

        for (String key : map.keySet()
                ) {
            System.out.println(key + "----" + map.get(key));
        }

    }
}
