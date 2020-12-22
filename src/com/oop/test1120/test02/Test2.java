package com.oop.test1120.test02;

public class Test2 {
    public static void main(String[] args) {
        String str = null;
        /*if (str!=null&!str.equals("")) {
            System.out.println("werwe");
        }*/
        if (str != null && !str.equals("")) {
            System.out.println("werwe");
        }
        int i = 2;
      /*  // && false || true
        if (i<2 ||++i>2) {
            System.out.println(i);
        }
*/

        System.out.println("-----------");
//        System.out.println(++i);
//        System.out.println(i++);
//        if (i++>2){
//            System.out.println(i);
//        }
//        System.out.println("===="+i);
        if (++i > 2) {
            System.out.println("111:" + i);
        }
        System.out.println("0000:" + i);
    }
}
