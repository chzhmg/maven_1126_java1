package com.oop.test1119.test01;

import com.sun.xml.internal.ws.api.addressing.WSEndpointReference;
import com.sun.xml.internal.ws.api.wsdl.parser.MetaDataResolver;

import java.sql.*;

/**
 * @author 小陈
 * @BaseDAO Class 对数据增删改查的工具类
 */
public abstract class BaseDAO {
    /**
     * 数据库连接属性
     */

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3307/testDB?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8";
    private static final String USER_NAME = "root";
    private static final String PASS_WORD = "1234";
//    /**
//     * sql连接对象
//     */
//    private static Connection conn = null;
//    /**
//     * sql命令执行对象
//     */
//    private static PreparedStatement pst = null;
//    /**
//     * 查询数据返回的结果集
//     */
//    private static ResultSet res = null;
//

    /**
     * 获取连接
     */
    public static Connection getConn() {
        Connection conn = null;
        try {
            /**
             * 加载驱动类
             */
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER_NAME, PASS_WORD);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 关闭数据库对象
     *
     * @param conn 连接对象
     * @param pst  命令执行对象
     * @param res  结果集对象
     */
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

    /**
     * 通用增删改
     *
     * @param sql    传入的sql语句
     * @param params 传入的可变参数
     * @return count
     */
    public static int executeUpdate(String sql, Object... params) {
        int count = 0;
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            pst = getConn().prepareStatement(sql);
            setPst(pst, params);
            count = pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(conn, pst, null);
        }
        return count;
    }

    /**
     * 通用查询
     *
     * @param sql    sql语句
     * @param params 传入的可变参数
     * @return res 执行之后返回执行结果
     */
    public static ResultSet getQuery(String sql, Object... params) {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet res = null;

        try {
            //预编译sql语法
            pst = getConn().prepareStatement(sql);
            //为占位符设置相应类型的数据
            setPst(pst, params);
            //执行sql,并返回结果集
            res = pst.executeQuery();
            System.out.println("============="+  res.getMetaData());


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return res;

    }

    /**
     * 通用设置参数
     *
     * @param pst    命令执行对象
     * @param params 设置的参数
     */
    public static void setPst(PreparedStatement pst, Object... params) {

        try {

            if (params == null) {
                return;

            } else {
                for (int i = 0; i < params.length; i++) {
                    pst.setObject(i + 1, params[i]);

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
