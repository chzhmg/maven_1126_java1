package com.oop.test1113.test03;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("sdfas");
        list.add(12);
        list.add(true);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-----------");
        for (Object val : list
                ) {
            System.out.println(val);
        }
        System.out.println("--------------------");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        System.out.println("===========================");
        Map map = new HashMap();
        map.put("name", "张三");
        map.put("sex", "男");
        map.put(1, 121);
        map.put(4, 121);
        map.put(2, "2323");
        for (Object key : map.keySet()) {
            System.out.println(map.get(key));
        }
        System.out.println("++++++++++++++++++++++++");
        for (Object v : map.entrySet()) {
            System.out.println(v);
        }
        Map hashTable = new Hashtable();
        hashTable.put("name", "张三");
        for (Object key : hashTable.keySet()) {
            System.out.println(map.get(key));
        }
        Hashtable table = new Hashtable();
        table.put("name", "张三");
        table.put("name", "张三");
        table.put(1, 123);
        table.put(2, 34);
        table.put(4, 12);
        table.put(3, 1231);
        System.out.println(table);
        System.out.println(table.elements());
        System.out.println(table.entrySet());
        String[] str = new String[]{"afsd", "asfas", "asdfa"};

        map.put("strArray", str);
        for (Object v:map.entrySet()
             ) {
            System.out.println(v);

        }

    }
}
