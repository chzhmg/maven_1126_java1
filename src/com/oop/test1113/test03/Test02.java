package com.oop.test1113.test03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List list = new ArrayList();

        System.out.println("现在开始录入人员信息:");
        while (true) {
            System.out.println("请输入姓名:");
            String name = sc.next();
            Student s = new Student();
            s.setName(name);
            if (list.contains(s)) {
                System.out.println("录入信息重复!");

            } else {
                list.add(s);
            }
            System.out.println("请问是否继续(y/n)");
            String yN = sc.next();
            if (yN.equals("n")) {
                break;
            }

        }
        for (Object o : list
                ) {
            System.out.println(o);
        }


    }
}
