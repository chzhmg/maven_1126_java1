package com.oop.test1116.test01;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Student("张三", "男"));
        list.add(new Student("李四", "男"));
        list.add(new Student("王五", "男"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------------");
        Set set = new HashSet();
        set.add(new Student("小明", "男"));
        set.add(new Student("小华", "男"));
        set.add(new Student("李明", "男"));


        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("------------");
        for (Object obj : set
                ) {
            System.out.println(obj);
        }

        System.out.println("--------------");
        Map map = new HashMap();
        map.put("张三", new Student("张三", "男"));
        map.put("李四", new Student("李四", "男"));
        map.put("王五", new Student("王五", "男"));
        for (Object key : map.keySet()) {
            System.out.println(key + "——》" + map.get(key));
        }
        System.out.println("-----------------------------");
        Set set1 = map.entrySet();

        for (Object val : set1) {
//            System.out.println(val);
            Map.Entry jz = (Map.Entry) val;
            System.out.println(jz);
            System.out.println(jz.getKey()+"——>"+jz.getValue());

        }
    }
}
