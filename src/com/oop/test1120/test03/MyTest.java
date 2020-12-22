package com.oop.test1120.test03;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MyTest {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyTest m = new MyTest();
        System.out.println("欢迎来到图书管理后台.........");
        while (true) {
            System.out.println("请选择 (1.查询 2.添加 3.修改 4.删除 5.退出)");
            int choose = sc.nextInt();
            if (choose == 1) {
                m.queryTest();

            } else if (choose == 2) {
                //调用添加图书信息的方法
                m.addTest();
            } else if (choose == 3) {
                m.updateTest();

            } else if (choose == 4) {
                m.deleteTest();
            } else if (choose == 5) {
                System.out.println("欢迎下次使用.......");
                break;
            } else {
                System.out.println("选择错误，请重新选择.....");

            }

        }
    }

    public void queryTest() {
        String sql = "select * from book";
        //调用方法
        List<Map<String, Object>> list = BaseDAO.executeQuery(sql);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

    }

    public void addTest() {
        //添加数据
        String sql = "insert into book(bookName,author,pubDate,price)" +
                " values(?,?,?,?)";
        System.out.println("-----添加数据-----");
        System.out.println("请输入书名:");
        String bookName = sc.next();
        System.out.println("请输入作者:");
        String author = sc.next();
        System.out.println("请输入出版日期:");
        String pubDate = sc.next();
        System.out.println("请输入价格:");
        Double price = sc.nextDouble();
        //调用方法
        int res = BaseDAO.executeUpdate(sql, bookName, author, pubDate, price);
        if (res >= 1) {
            System.out.println("成功添加了" + res + "条");

        } else {
            System.out.println("未添加成功.....");
        }
    }

    public void updateTest() {
        //修改
        System.out.println("----修改---");
        String sql = "update   book set bookName=?,author=?,price=? where bookId=?";
        System.out.println("根据编号修改，请输入正确的编号:");
        String bookId = sc.next();
        System.out.println("请输入书名:");
        String bookName = sc.next();
        System.out.println("请输入作者:");
        String author = sc.next();
        System.out.println("请输入价格:");
        Double price = sc.nextDouble();
        //调用方法
        int count = BaseDAO.executeUpdate(sql, bookName, author, price, bookId);
        if (count >= 1) {
            System.out.println("成功修改了" + count + "条");

        } else {
            System.out.println("未修改成功.....");
        }
    }

    public void deleteTest() {
        //删除书籍信息
        System.out.println("----删除书籍信息----");
        System.out.println("请输入书编号:");
        int bookId = sc.nextInt();
        String sql = "delete from book where bookId=?";
        //调用方法
        int count = BaseDAO.executeUpdate(sql, bookId);
        if (count >= 1) {
            System.out.println("成功删除了" + count + "条");

        } else {
            System.out.println("未删除成功.....");
        }
    }
}
