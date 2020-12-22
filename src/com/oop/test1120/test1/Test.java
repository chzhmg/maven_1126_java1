package com.oop.test1120.test1;

import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        //插入数据
        String sql = "insert into book(bookName,author,pubDate,price) " +
                "values" +
                "(?,?,?,?)";
        String bookName = "西游记";
        String author = "吴承恩";
        String pubDate = "2010-09-09";
        double price = 32.1;

        int count = BaseDAO.executeUpdate(sql, bookName, author, pubDate, price);
        if (count >= 1) {
            System.out.println("添加了" + count + "条");
        } else {
            System.out.println("未添加");

        }
        System.out.println("查询------------");
        sql = "select * from book";
        List<Map<String, Object>> list = BaseDAO.executeQuery(sql);
        for (Map<String, Object> o : list
                ) {
            System.out.println(o);
        }

    }
}
