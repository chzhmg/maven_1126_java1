package com.oop.test1119.test02;

import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        //添加数据
        int id = 10;
        String name = "小黑";
        String sex = "男";
        int age = 19;
        String sql = "insert into studentinfo(id,name,sex,age)" +
                "values(?,?,?,?)";
        Object[] params = {id, name, sex, age};
        int count = BaseDAO.executeUpdate(sql, params);
        if (count >= 1) {
            System.out.println("插入了" + count + "条");
        } else {
            System.out.println("未插入数据");
        }
        System.out.println("查询数据----------------");
        sql = "select * from studentinfo";
        List<Map<String, Object>> list = BaseDAO.executeQuery(sql);
        for (Map<String, Object> o : list) {
            System.out.println(o);
        }
    }

    @org.junit.Test
    public void test() {
        int i = 1;
        int sum = 0;
        while (true) {
            sum += i;
            if (i == 100) {
                break;
            }
            i++;
        }
        System.out.println(i);
        System.out.println(sum);
        System.out.println("-------------");
        int i1 = 1;
        int sum1 = 0;
        while (i1 <= 100) {
            sum1 += i1;
            if (i1 == 100) {
                break;
            }
            i1++;


        }
        System.out.println(i1);
        System.out.println(sum1);
    }
}
