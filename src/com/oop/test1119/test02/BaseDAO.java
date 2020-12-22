package com.oop.test1119.test02;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseDAO {
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3307/testDB?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8";
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
        Connection conn = null;
        PreparedStatement pst = null;
        int count = 0;
        try {
            pst = getConn().prepareStatement(sql);
            setParams(pst, params);
            count = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(conn,pst,null);
        }
        return count;
    }

    public static List<Map<String, Object>> executeQuery(String sql, Object... params) {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet res = null;
        List<Map<String, Object>> list = new ArrayList<>();
        try {
            pst = getConn().prepareStatement(sql);
            setParams(pst, params);
            res = pst.executeQuery();
            ResultSetMetaData rsMd = res.getMetaData();
            //获取列的个数
            int clCount = rsMd.getColumnCount();
            while (res.next()) {
                Map<String, Object> map = new HashMap<>();
                //获取列的名字
                for (int i = 1; i <= clCount; i++) {
                    String clName = rsMd.getColumnName(i);
                    Object clVal = res.getObject(i);
                    map.put(clName, clVal);
                }
                list.add(map);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(conn,pst,res);
        }

        return list;
    }
}
