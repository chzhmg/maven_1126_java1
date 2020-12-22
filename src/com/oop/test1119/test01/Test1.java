package com.oop.test1119.test01;

import java.sql.ResultSet;

public class Test1 extends BaseDAO {
    public static void main(String[] args) {
        String name = "李娜";
        int id = 6;
        int age = 18;
        String sex = "女";
      Object[] param = {id, name, sex, age};
        String sql = "insert into studentinfo(id,name,sex,age)" +
                "values" +
                "(?,?,?,?)";
//          int count = BaseDAO.executeUpdate(sql, param);
//        if (count >= 1) {
//            System.out.println("添加了" + count + "条");
//        } else {
//            System.out.println("未添加数据....");
//        }
        sql = "select * from studentinfo where name=?";
        ResultSet res = BaseDAO.getQuery(sql, name);
        try {

            while (res.next()) {
                id = res.getInt(1);
                name = res.getString(2);
                sex = res.getString(3);
                age = res.getInt(4);
                System.out.println(id + " " + name + " " + sex + " " + age);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeAll(null, null, res);
        }

    }
}
