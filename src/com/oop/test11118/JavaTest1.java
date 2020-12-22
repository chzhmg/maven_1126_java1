package com.oop.test11118;

import com.mysql.cj.protocol.Resultset;
import org.junit.Test;

import java.sql.*;
import java.util.Scanner;

public class JavaTest1 {


    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3307/testDB?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8";
    private static String username = "root";
    private static String password = "1234";
    private static Connection conn = null;
    private static PreparedStatement pre = null;
    private static ResultSet res = null;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号");
        String name = sc.next();
        System.out.println("请输入密码:");
        String pwd = sc.next();
        JavaTest1.test(name, pwd);

    }


    public static void test(String name, String pwd) {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
//            String sql= "insert into UserInfo(name,pwd) values('张三','asdfas')";
//            String sql = "INSERT INTO UserInfo(name,pwd)  VALUES('" + name + "','" + pwd + "')";
            String sql ="insert into UserInfo (name,pwd) values(?,?)";

            pre = conn.prepareStatement(sql);
            pre.setString(1,pwd);
            
            int count = pre.executeUpdate();
            if (count >= 1) {
                System.out.println("插入了" + count + "条");
            }
            sql = "SELECT * FROM UserInfo";
            System.out.println("执行查询.....");
            pre = conn.prepareStatement(sql);
            res = pre.executeQuery();
            while (res.next()) {
                System.out.println(res.getInt(1) + res.getString(2) + res.getString(3));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (pre != null) {
                    pre.close();
                }
                if (res != null) {
                    res.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
