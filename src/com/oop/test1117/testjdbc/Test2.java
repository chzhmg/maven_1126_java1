package com.oop.test1117.testjdbc;

import com.oop.test11118.JavaTest1;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号");
        String name = sc.next();
        System.out.println("请输入密码:");
        String pwd = sc.next();
        //添加数据的sql语句
        String sql = "insert into student(stuName,sex) values('"+name+"','"+pwd+"')";
        int count = JDBCTest2.Update(sql);
        if (count >= 1) {
            System.out.println("添加了" + count + "条");

        } else {
            System.out.println("未添加数据");
        }
        //定义查询的sql语句
        sql = "select * from student";
        ResultSet res = JDBCTest2.Query(sql);
        while (res.next()) {
            System.out.println(res.getString("stuName") + " " + res.getString("sex"));
        }
        JDBCTest2.closeAll(null, null,res);
    }
}
