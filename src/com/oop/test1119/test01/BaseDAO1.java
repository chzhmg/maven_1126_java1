package com.oop.test1119.test01;

import java.sql.*;
import java.util.*;

public class BaseDAO1 {
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3307/testDB?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8";
    private static String username = "root";
    private static String password = "1234";

    public static Connection getConn() {
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;
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
        } finally {
            closeAll(conn, pst, null);
        }
        return count;

    }
  /*  public  static  List<Map<String,Object>> executeQuery(String sql, Object...params){
        //定义集合容器，用于存储表数据
        List<Map<String,Object>> rowsList = new ArrayList<Map<String,Object>>();
        //连接
        Connection con = null;
        //命令执行对象
        PreparedStatement pst = null;
        //结果集对象
        ResultSet rs = null;

        try{
            //获取连接
            con = getConn();
            //创建命令执行对象
            pst = con.prepareStatement(sql);
            //设置参数
            setParams(pst,params);
            //执行查询
            rs = pst.executeQuery();
            //通过结果集对象获取结果集结构对象
            ResultSetMetaData rsmd =rs.getMetaData();
            //获取列的个数
            int colCount = rsmd.getColumnCount();
            //逐行遍历数据，将数据存储到List集合
            while (rs.next()){
                //遍历每一行，将一行的各个列存入Map中
                Map<String,Object> colsMap = new HashMap<String,Object>();
                //循环每个列，存入map
                for(int i=1;i<=colCount;i++){
                    //获取当前列的名字
                    String colName = rsmd.getColumnName(i);
                    //获取当前列的值
                    Object colVal = rs.getObject(i);
                    //将数据存入map
                    colsMap.put(colName,colVal);
                }
                //将当前行封装好Map集合存入行的集合中
                //colsMap： 存储的是一行数据
                rowsList.add(colsMap);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            closeAll(con,pst,rs);
        }
        //返回结果
        return rowsList;
    }*/
    public static List<Map<String, Object>> executeQuery(String sql, Object... params) {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet res = null;
        List<Map<String, Object>> rows = new ArrayList<>();
        try {
            pst = getConn().prepareStatement(sql);
            setParams(pst, params);
            res = pst.executeQuery();
            //查询结果的结构：
            //计算每行有几列(查询结果中有几列)
            //每列的列名

            //结果集结构对象
            ResultSetMetaData resMd = res.getMetaData();
            //获取查询结果的列数
            int columnCount = resMd.getColumnCount();
            System.out.println("一共有" + columnCount + "列");
            //读取每条数据并存储到集合中
            while (res.next()) {
                Map<String, Object> cols = new HashMap<>();

                //将读取到的当前行，存储到map中

                for (int i = 1; i <= columnCount; i++) {
                    //获取当前列的名字
                    String columnName = resMd.getColumnName(i);
                    //获取当前列的值
                    Object columnVal = res.getObject(i);
                    cols.put(columnName, columnVal);
                }
                rows.add(cols);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(conn, pst, res);
        }
        return rows;
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
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
