package com.oop.test1117.testjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws SQLException {

//        System.out.println("----------添加数据-----------");
//        sql = "insert into student(sno,sname,ssex,sbirthday,class) " +
//                " select '202001','张三','男','2001-09-09','AAA01' union" +
//                " select '202002','张三1','女','2002-09-09','AAA02' ";
//        if (sql != null || sql != "") {
//            System.out.println("查入数据的sql语法:"+sql);
//            //调用通用的更新方法
//            int count = JDBCTest.Update(sql);
//            if (count >= 1) {
//                System.out.println("添加了" + count + "条");
//
//            }else{
//                System.out.println("没有添加数据......");
//            }
//        }
//删除表数据
        String sql = "delete from student where sno ='202002'";
        if (sql != null || sql != "") {
            //调用方法
            int count = JDBCTest.Update(sql);
            if (count >= 1) {
                System.out.println("删除了" + count + "条");
            } else {
                System.out.println("未删除数据");
            }
        } else {
            System.out.println("sql语法不能为空....");
        }


        //查询表数据
        //创建是sql语句
        sql = "select * from student";
        if (sql != null || sql != "") {
            //调用通用查询的方法
            ResultSet res = JDBCTest.Query(sql);
            //res 是查询到的返回的结果集  循环遍历数据
            while (res.next()) {
                System.out.println(res.getString("sname"));
            }


        } else {
            System.out.println("sql语句不能为空");
        }
    }

}
