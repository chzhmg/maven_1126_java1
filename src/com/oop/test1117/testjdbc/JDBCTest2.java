package com.oop.test1117.testjdbc;

import java.sql.*;

public class JDBCTest2 {
    private static String driver = "com.mysql.cj.jdbc.Driver";
    /* 错误写法  private static String url = "jdbc://mysql:/localhost:3307?1117_db&useSSL=false&serverTimezone&characterEncoding=utf8";*/
//    private static String url = "jdbc:mysql://localhost:3307/st_db?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8";
    private static String url = "jdbc:mysql://localhost:3307/1117_db?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8";


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

    //创建连接对象

    public static Connection getConn() throws SQLException {
        conn = DriverManager.getConnection(url, username, password);
         return conn;
    }

    //增删改
    
    public static int Update(String sql) {
        int count = 0;
        try {
            pre = getConn().prepareStatement(sql);
            count = pre.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return count;
    }

    //查询
    public static ResultSet Query(String sql) {
        try {
            pre = getConn().prepareStatement(sql);
            res = pre.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;

    }

    public static void closeAll(Connection conn, PreparedStatement pre, ResultSet res) {


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
