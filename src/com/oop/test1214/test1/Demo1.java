package com.oop.test1214.test1;

public class Demo1 {
  /*  public static void getNumber(int number) {
        System.out.println(number);
        if (number <= 5000) {
            getNumber(number * 2);
            System.out.println(number);
        }
    }*/

    public static void main(String[] args) {
        //  getNumber(1237);
        int age = getAge(8);
        System.out.println("第八个人的年龄为:" + age);
        System.out.println();
        StringBuffer sbf= new StringBuffer(1212);
        toBinary(8,sbf);
//        10 +2*7=24
    }

 /*   public static void test(int number) {
        System.out.println(number);
        if (number <= 5000) {
            test(number * 2);
            System.out.println(number);
        }
    }*/


    public static int getAge(int i) {
        if (i == 1) {
            return 10;
        }
        return getAge((i - 1)) + 2;

    }
    public static void toBinary(int n, StringBuffer result)
    {

        if(n/2 != 0)
            toBinary(n/2,result);
        result.append(n%2);
        System.out.println(n+" "+result);
    }


}
