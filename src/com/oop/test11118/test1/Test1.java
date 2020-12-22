package com.oop.test11118.test1;

import java.sql.*;


public class Test1 {

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

    public static int executeUpdate(String sql, Object...objects) {
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

    public static void setPst(PreparedStatement pst, Object...objects) {
        if (objects==null){
            return;
        }else {
            for (int i = 0; i <objects.length; i++) {
                try {
                    pst.setObject(i+1, objects[i]);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }



    }

    public static void main(String[] args) {
        try {

            String name ="陈亚伦";
            String pwd = "chen";
            String sql = "insert into UserInfo(name,pwd) values(?,?)";

            int count = executeUpdate(sql, name, pwd);
            if (count >= 1) {
                System.out.println("添加了" + count + "条");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try{
               if (conn != null) {
                   conn.close();
               }
               if (pst != null) {
                   pst.close();
               }
           }catch (Exception e){
               e.printStackTrace();
           }
        }

    }
}