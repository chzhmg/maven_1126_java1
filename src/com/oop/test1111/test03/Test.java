package com.oop.test1111.test03;

public class Test {
    public static void main(String[] args) {
        People  p = new People();
        p.setName("小明");
        //创建设备
        Interque phone = new Phone();
        Interque Pc = new PC();
        //创建网页
        WebSite baidu = new BaiDu();
        WebSite wangyi = new WangYi();
        //设置上网设备
        p.setInterque(phone);
        p.goToOnline(baidu);
        System.out.println("------------");
        p.setInterque(Pc);
        p.goToOnline(wangyi);
    }

}
