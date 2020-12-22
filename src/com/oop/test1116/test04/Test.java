package com.oop.test1116.test04;

public class Test {
    public static void main(String[] args) {
        String s1 = null;
        int x = 0;
        //&具有短路的作用，当前面一个条件不满足时，还会继续进行 另一条件的判断 然后不报出相应的异常
//        if (s1 != null & !s1.equals("")) {
//            System.out.println("&");
//        }
//&& 是两个条件同时满足下，当前一个条件不满足时，将不会继续另一个条件的判断
        if (s1 != null && !s1.equals("")) {
            System.out.println("&&");
        }
        System.out.println("--------switch---------");
        char s = 'a';
//switch  中  可使用 int byte Integer,String ,char Character 唯独long 不适用
//        long l = 12;
//        switch (s) {
//            case 1:
//                System.out.println("12");
//                break;
//            default:
//                System.out.println('a');
//                break;
//        }
         short sh = 1;//会自动转换为 int类型
         int sh2 =sh + 1;//再次进行赋值时，就会报类型转换错误
        short sh1 = 1;
         sh1 += 1;//这个与上面的
    }
}
