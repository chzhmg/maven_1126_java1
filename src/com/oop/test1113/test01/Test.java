package com.oop.test1113.test01;

import com.oop.test1113.test01.People;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("正在录入人员信息");
        String isGo = null;
         List list = new ArrayList();
        
        while (true) {
            System.out.println("请输入名字:");
            String name = sc.next();
            System.out.println("请输入性别:");
            String sex = sc.next();
            People p1 = new People();
            p1.setName(name);
            p1.setSex(sex);
            
            if (list.contains(p1)) {
                System.out.println("信息重复");
            } else {
                list.add(p1);
            }


            System.out.println("是否继续:(y/n)");
            isGo = sc.next();
            if (isGo.equals("n")) {
                System.out.println(list);
                break;
            }
        }


    }
}
