package com.oop.test1120.test1;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择:1.查询 2.修改 3.删除 4.添加 5.退出");
            //根据编号做出相应的操作
            int choose = sc.nextInt();
            if (choose == 1) {
                System.out.println("查询数据:是否按照编号查询数据(y/n)");
                String check = sc.next();
                if (check.equals("y")) {
                    String sql = "select * from book where bookId=?";
                    System.out.println("请输入编号:");
                    //id 用于接收查询的编号
                    int id = sc.nextInt();
                    //调用查询的通用方法
                    List<Map<String, Object>> rowsList = BaseDAO.executeQuery(sql, id);
                    for (Map<String, Object> map : rowsList) {
                        System.out.println(map);

                    }
                } else if (check.equals("n")) {
                    //直接查询某个表的全部数据
                    String sql = "select * from book";
                    List<Map<String, Object>> rowsList = BaseDAO.executeQuery(sql);
                    for (Map<String, Object> map : rowsList) {
                        System.out.println(map);

                    }
                }

            } else if (choose == 2) {
                String sql = "update book set price=? where bookId=?";
                System.out.println("修改数据");
                System.out.println("根据编号修改,请输入正确的编号:");
                int id = sc.nextInt();
                System.out.println("修改价格，请输入要修改的价格:");
                Double price = sc.nextDouble();
                //调用方法
                int res = BaseDAO.executeUpdate(sql, price, id);
                if (res >= 1) {
                    System.out.println("成功修改" + res + "条");
                } else {
                    System.out.println("未修改成功 编号不正确.....");
                }
            } else if (choose == 3) {
                String sql = "delete from book where bookId=?";
                System.out.println("删除数据");
                System.out.println("请输入正确的图书编号，否则无法删除成功:");
                int id = sc.nextInt();
                //调用方法
                int res = BaseDAO.executeUpdate(sql, id);
                if (res >= 1) {
                    System.out.println("成功删除" + res + "条");
                } else {
                    System.out.println("图书编号不正确，暂未删除成功......");
                }


            } else if (choose == 4) {
                System.out.println("添加数据");
                String sql = "insert into book" +
                        " (bookName,author,pubDate,price)" +
                        " values(?,?,?,?)";
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
                    System.out.println("成功添加" + res + "条");

                } else {
                    System.out.println("未添加成功，可能输入的类型与数据类型不匹配");
                }
            } else if (choose == 5) {
                System.out.println("退出操作");
                break;
            } else {
                System.out.println("选择有误请重新选择");
            }
        }
    }

}
