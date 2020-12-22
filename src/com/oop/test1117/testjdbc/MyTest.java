package com.oop.test1117.testjdbc;

import com.oop.test1111.ceshi_1111.Driver;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MyTest {
    @Test
    public void test() {
        //数据库四大金刚
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3307/st_db?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8";
        String username = "root";
        String password = "1234";

        //定义数据库连接对象
        //连接对象
        Connection conn = null;
        //命令执行对象
        PreparedStatement pre = null;
        //结果集对象
        ResultSet res = null;
        try {
            //加载驱动类
            Class.forName(driver);
            //连接
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("-----连接创建成功------");
            //声明sql语句
            String sql = "SELECT * FROM score";
            //执行sql命令

            pre = conn.prepareStatement(sql);
            System.out.println("sql命令执行成功！！！");
            //接收查询到的结果集
            res = pre.executeQuery();


            while (res.next()) {
                System.out.print(res.getString(1) + "----");
                System.out.print(res.getString(2) + "----");
                System.out.print(res.getString(3) + "----");
                System.out.println(res.getString(4) + "----");


            }

            conn.close();
            res.close();
            pre.close();
            System.out.println("----------连接关闭成功！！--------");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
