package com.oop.test1117.testjdbc;

import java.sql.*;

public class JDBCTest {
    private static String driver = "com.mysql.cj.jdbc.Driver";
    //String url = "jdbc:mysql://localhost:3307/st_db?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8";

    private static String url = "jdbc:mysql://localhost:3307/st_db?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8";
    private static String username = "root";
    private static String password = "1234";
    //连接对象
    private static Connection conn = null;
    // 命令执行对象
    private static PreparedStatement pre = null;
    //结果集对象
    private static ResultSet res = null;

    //加载驱动
    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //创建连接对象
    public static Connection getConn() {
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //通用查询的方法
    public static ResultSet Query(String sql) throws SQLException {
        //创建连接
        pre = getConn().prepareStatement(sql);
        //执行sql命令
        res = pre.executeQuery();
        return res;
    }

    //创建通用增删改的方法
    public static int Update(String sql) throws SQLException {
        //影响条数
        int count = 0;
        //创建连接
        pre = getConn().prepareStatement(sql);
        count = pre.executeUpdate();
        return count;

    }

    //通用的close方法

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
