package com.oop.test1119.test01;

import com.sun.org.apache.regexp.internal.RE;

import java.sql.*;

public class JDBCTest1 {
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3307/testDB?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8";
    private static final String username = "root";
    private static final String password = "1234";

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

    public static int executeUpdate(String sql, Object... objects) {
        int count = 0;
        try {
            pst = getConn().prepareStatement(sql);
            setPst(pst, objects);
            count = pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static ResultSet Query(String sql, Object... objects) {

        try {
            //预编译sql语法
            pst = getConn().prepareStatement(sql);
            //为占位符设置相应类型的数据
            setPst(pst, objects);
            //执行sql,并返回结果集
            res = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return res;

    }

    public static void setPst(PreparedStatement pst, Object... objects) {

        try {

            if (objects == null) {
                return;

            } else {
                for (int i = 0; i < objects.length; i++) {
                    pst.setObject(i + 1, objects[i]);

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void insert() {
        try {

            String sql = "INSERT INTO studentinfo(id,name,sex,age) VALUES(?,?,?,?)";

            pst = getConn().prepareStatement(sql);
            pst.setInt(1, 2);
            pst.setString(2, "张三1");
            pst.setString(3, "男");
            pst.setInt(4, 19);
            int count = pst.executeUpdate();
            if (count >= 1) {
                System.out.println("插入了" + count + "条");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();

                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                e.printStackTrace();

            }
        }

    }

    public static void main(String[] args) {
        JDBCTest1.insert();
    }
}
