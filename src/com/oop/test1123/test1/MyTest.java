package com.oop.test1123.test1;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MyTest {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        MyTest m = new MyTest();
        while (true) {
            System.out.println("请选择:(1.查询修改 4.删除 5.退出)");
            int choose = sc.nextInt();
            if (choose == 1) {
                m.test();
            } else if (choose == 2) {
                m.addTest();
            } else if (choose == 3) {

            } else if (choose == 4) {
                m.deleteTest();
            } else if (choose == 5) {
                System.out.println("欢迎下次使用。。。");
                break;
            } else {
                System.out.println("选择错误，请重新选择.....");
            }
        }
    }

    public void addTest() {
        System.out.println("添加学生信息");
        String sql = "insert into Student " +
                " (stuName,sex,birthday)" +
                " values(?,?,?)";
        System.out.println("请输入姓名：");
        String stuName = sc.next();
        System.out.println("请输入性别:");
        String sex = sc.next();
        System.out.println("请输入生日:");
        String birthday = sc.next();
        int res = BaseDAO.BaseDAO1.executeUpdate(sql, stuName, sex, birthday);
        if (res >= 1) {
            System.out.println("添加了" + res + "条");

        } else {
            System.out.println("未添加成功");
        }
    }

    public void deleteTest() {
        System.out.println("删除");
        System.out.println("根据学生id删除数据:");
        int id = sc.nextInt();
        String sql = "delete  from  Student  where stuId=?";
        int res = BaseDAO.BaseDAO1.executeUpdate(sql, id);
        if (res >= 1) {
            System.out.println("删除了" + res + "条");
        }
    }

    public void test() {
        String sql = "select * from student";
        List<Map<String, Object>> List = BaseDAO.BaseDAO1.executeQuery(sql);
        for (Map<String, Object> o : List) {
            System.out.println(o);
        }
    }
}
