package com.oop.test1120.test1;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseDAO {
    //连接属性

    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3307/1120db?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8";
    private static String username = "root";
    private static String password = "1234";

    public static Connection getConn() {
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeAll(Connection conn, PreparedStatement pst, ResultSet res) {

        try {
            if (res != null) {
                res.close();
            }
            if (pst != null) {
                pst.close();
            }
            if (conn != null) {
                conn.close();

            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //设置参数
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

    public static int executeUpdate(String sql, Object... params) {
        int count = 0;
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = getConn();
            pst = conn.prepareStatement(sql);
            setParams(pst, params);
            count = pst.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            closeAll(conn, pst, null);
        }
        return count;
    }

    //查询
    public static List<Map<String, Object>> executeQuery(String sql, Object... params) {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet res = null;
        List<Map<String, Object>> list = new ArrayList<>();
        try {

            conn = getConn();
            pst = conn.prepareStatement(sql);
            setParams(pst, params);
            res = pst.executeQuery();
            ResultSetMetaData rsMd = res.getMetaData();
            //获取列的个数
            int clCount = rsMd.getColumnCount();
            while (res.next()) {
                Map<String, Object> map = new HashMap<>();
                for (int i = 1; i <= clCount; i++) {
                    //获取列名
                    String clName = rsMd.getColumnName(i);
                    Object clVal = res.getObject(i);
                    map.put(clName, clVal);

                }
                list.add(map);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            closeAll(conn, pst, res);
        }
        return list;
    }
}
