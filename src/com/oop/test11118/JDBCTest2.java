package com.oop.test11118;

import java.sql.*;

public class JDBCTest2 {
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3307/testDB?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8";
    private static String username = "root";
    private static String password = "1234";
    private static Connection conn = null;
    private static PreparedStatement pre = null;
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

    public static int executeUpdate(String sql,Object...obj) {
        int count = 0;
        //创建连接
        try {
            pre = getConn().prepareStatement(sql);
            count = pre.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static ResultSet executeQuery(String sql) {
        try {
            pre = getConn().prepareStatement(sql);
            res = pre.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
//    public static void
}
