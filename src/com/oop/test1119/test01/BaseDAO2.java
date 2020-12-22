package com.oop.test1119.test01;

import java.sql.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class BaseDAO2 {
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3307/testDB?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8";
    private static String usernmae = "root";
    private static String password = "1234";

    public static Connection getConnection() {
        Connection conn = null;
        PreparedStatement pst = null;
        //加载驱动类
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usernmae, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //关闭连接

    public static void closeAll(Connection conn, PreparedStatement pst, ResultSet res) {
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
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    //通用设置参数
    public static void setParams(PreparedStatement pst, Object... params) {

        if (params == null) {
            return;
        }
        for (int i = 0; i < params.length; i++) {
            try {
                pst.setObject(i + 1, params[i]);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //通用增删改

    public static int executeUpdate(String sql, Object... params) {
        Connection conn = null;
        PreparedStatement pst = null;
        int count = 0;
        try {
            pst = getConnection().prepareStatement(sql);
            setParams(pst, params);
            count = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(conn, pst, null);
        }
        return count;
    }

    public static List<Map<String, Object>> executeQuery(String sql, Object... params) {

        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet res = null;
        List<Map<String, Object>> cols = new ArrayList<>();

        try {
            pst = getConnection().prepareStatement(sql);
            setParams(pst, params);
            res = pst.executeQuery();
            ResultSetMetaData rsMd = res.getMetaData();
            //获取结果集中有多少列
            int clCount = rsMd.getColumnCount();
            while (res.next()) {
                Map<String, Object> rows = new Hashtable<>();

                for (int i = 1; i <= clCount; i++) {
                    //获取列的name
                    String clName = rsMd.getColumnName(i);
                    //根据列的name获取对应列的值
                    Object clVal = res.getObject(i);
                    //存入到map中
                    rows.put(clName, clVal);
                }
                cols.add(rows);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(conn, pst, res);
        }
        return cols;
    }
}
