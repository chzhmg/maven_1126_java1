package com.oop.test1113.test02;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        //Map 的实现类 HashMap
        //  键值可以重复，但在键值相同的情况下，则会覆盖前面的值
        //
        Student student = new Student("小明", "男");
        Student student1 = new Student("小明", "男");
        //   Student student1 = new Student("小明", "男a");
        Map map = new HashMap();
        map.put("number1", 12);
        map.put("number1", 12);
        map.put("number", 121212);

        //
       map.put(student,"info1");
       map.put(student1,"info2");

        map.put("true", true);


//        System.out.println(map);
        Set set = map.keySet();
        System.out.println(set);

        for (Object key : map.keySet()) {

            System.out.println(key + " ——》" + map.get(key));


        }
        System.out.println("-------------------");
        //根据键值删除相应的数据
        map.remove("number");
        System.out.println("entrySet()" + map.entrySet());
        System.out.println(map);

        System.out.println("获取HashMap集合的长度:"+ map.size());
        //获取map结合内的所有的值（不包含key）
        System.out.println(map.values());
        //获取map集合内的所有键值(不包含val)
        System.out.println(map.keySet());
        //校验是否存在相同的key 返回true/false
        System.out.println(map.containsKey("number1"));
        //校验是否存在相同的val 返回true/false
        System.out.println(map.containsValue(1213));
        //判断map集合是否为空
        System.out.println(map.isEmpty());
        //判断map集合中的某个键对应的val是否与这个 目标内容 是否有共同指出
        System.out.println(map.replace("number1",1231231));
        System.out.println("number1的hashCode值: "+map.get("number1").hashCode());
//        System.out.println("number1的hashCode值: "+map.get("info").hashCode());
        System.out.println("map.entrySet() 直接获取键和值:");
        for (Object val : map.entrySet()) {
            System.out.println(val);
        }
    }
}
