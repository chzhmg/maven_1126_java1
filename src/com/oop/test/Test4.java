package com.oop.test;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
//        Java Enumeration接口
     /*   Enumeration<String> days;
        Vector<String> dayNames = new Vector<String>();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days = dayNames.elements();
        System.out.println(days);
        System.out.println("----------");

        //    days.hasMoreElements()
        //    测试此枚举是否包含更多的元素。
        while (days.hasMoreElements()) {
            //days.nextElement()
            //如果此枚举对象至少还有一个可提供的元素，则返回此枚举的下一个元素。
            System.out.println(days.nextElement());
        }
*/
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(12);
        integerList.add(14);
        integerList.add(645);
        for (int s : integerList) {
            System.out.println(s);

        }
        System.out.println("----------");
        int[] num = new int[integerList.size()];
        //迭代器进行迭代
        Iterator it = integerList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("---------");
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }
        System.out.println("----------------");

        HashMap<String, Object> hs = new HashMap<String, Object>();
        hs.put("name", "小明");
        hs.put("sex", "男");
        hs.put("age", 19);
        for (String key : hs.keySet()
                ) {
            System.out.println("key=" + key + " value=" + hs.get(key));
        }

    }
}
