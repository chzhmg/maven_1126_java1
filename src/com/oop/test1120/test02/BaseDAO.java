package com.oop.test1120.test02;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseDAO {
    //连接属性
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3307/testDB?useSSL=false&serverTime=Asia/Shanghai&characterEncoding=utf8";
    private static String username = "root";
    private static String password = "1234";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeAll(Connection conn, PreparedStatement pst, ResultSet res) {
        try {
            if (res != null)
                res.close();
            if (pst != null)
                pst.close();
            if (conn != null)
                conn.close();
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
            conn = getConnection();
            pst = conn.prepareStatement(sql);
            setParams(pst, params);
            count = pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeAll(conn, pst, null);
        }

        return count;
    }

    public static List<Map<String, Object>> executeQuery(String sql, Object... params) {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Map<String, Object>> rowsList = new ArrayList<>();
        try {
            conn = getConnection();
            pst = conn.prepareStatement(sql);
            setParams(pst, params);
            rs = pst.executeQuery();
            ResultSetMetaData reMd = rs.getMetaData();
            int colCount = reMd.getColumnCount();
            while (rs.next()) {
                Map<String, Object> colsMap = new HashMap<>();
                for (int i = 1; i <= colCount; i++) {
                    String colName = reMd.getColumnName(i);
                    Object colVal = rs.getObject(i);
                    colsMap.put(colName, colVal);
                }
                rowsList.add(colsMap);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeAll(conn, pst, rs);
        }

        return rowsList;
    }
}
