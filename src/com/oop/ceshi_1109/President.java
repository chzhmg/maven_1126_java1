package com.oop.ceshi_1109;

public class President {
    //成员属性
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age < 0 || age > 200) {
            throw new Exception("年龄非法，无法设置年龄");
        } else {
            this.age = age;
        }

    }

    //有参构造
    public President(String name, int age) throws Exception {
        //this.name = name;
        // this.age = age;
        this.setName(name);
        this.setAge(age);
    }

    //无参无返回值成员方法
    public void say() {
        if (this.name.equals("拜登")) {
            System.out.println("现在，是时候治愈美国了");
        } else if (this.name.equals("特朗普")) {
            System.out.println("maga2020! 让美国再次伟大");

        }
    }


    public String vote(int ticket) {
        String isSc = null;
        if (ticket > 270) {
            isSc = this.name + "当上了美国总统";
        } else if (ticket >= 0 && ticket <= 270) {
            isSc = this.name + "选举失败";
        }
        return isSc;

    }
}
