package com.oop.test1119.test01;

import java.util.List;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        //sql语句
        String sql = "select * from studentinfo";
        List<Map<String, Object>> list = BaseDAO1.executeQuery(sql);
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
