package com.oop.test1119.test01;

import java.sql.*;

public class SeletTest {
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3307/testDB?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8";
    private static String username = "root";
    private static String password = "1234";

    private static Connection conn = null;
    private static PreparedStatement pst = null;
    private static ResultSet res = null;

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConn() {
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void select() {
        try {
            String sql = "SELECT * FROM studentInfo";
            pst = getConn().prepareStatement(sql);
            res = pst.executeQuery();
            while (res.next()) {
                System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3) + " " + res.getInt(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (conn != null) {
                conn.close();

            }
            if (pst != null) {
                pst.close();
            }
            if (res != null) {
                res.close();
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        String sql = "select * from studentinfo where name=?";
        String name = "张三";
        ResultSet res = JDBCTest1.Query(sql, name);
        try {
            while (res.next()) {
                System.out.println(res.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();

                }
                if (pst != null) {
                    pst.close();
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
