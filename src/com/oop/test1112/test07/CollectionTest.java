package com.oop.test1112.test07;

import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {
        //List
        List<Object> list = new ArrayList<Object>();
        list.add(1);
        list.add("cheng");
        list.add(true);
        //按索引添加数据
        list.add(2, 1231);
        //按照索引删除数据
        // list.remove(1);
        list.remove(Integer.valueOf(1));
//        list.remove(true);
        //删除一组数据
        // list.removeAll(list);
        //集合中包含某个元素
         System.out.println(list.contains(true));
        System.out.println("集合的长度:" + list.size());
        System.out.println("判断集合是否为空:" + list.isEmpty());
        System.out.println("根据索引获取集合中的值" + list.get(1));
        System.out.println("list集合的hashCode值:" + list.hashCode());
        System.out.println(list.lastIndexOf("cheng"));
        System.out.println("----------foreach遍历--------");
        for (Object l : list) {
            System.out.println(l);
        }
        System.out.println("-----for遍历---------");
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------迭代器遍历-----------");
        //c. 使用迭代器遍历
        //通过迭代器工具来遍历集合
        //通过Iterator方法返回迭代器对象
        Iterator it = list.iterator();
        //it.hasNext()：集合种是否元素，返回true/false
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        System.out.println("========================");
        List<String> vlist = new Vector<String>();
        vlist.add("xx");
        vlist.add("xx");
        vlist.add("xerx");
        vlist.add("xx");
        vlist.add("xx");
        //在某个位置添加一个字符串
        vlist.add(4, "1231231");
        //按数据内容删除
        //    vlist.remove("xerx");
        //按索引删除数据
        //      vlist.remove(1);
        for (String s : vlist
                ) {
            System.out.println(s);

        }
        System.out.println(Integer.toHexString(list.hashCode()));
        System.out.println(list);



    }


}
