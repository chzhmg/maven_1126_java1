package com.oop.test1215.test1;

import java.util.Arrays;

public class SwapDemo {
    public static void main(String[] args) {
        int[] a = new int[]{
                (int) (Math.random() * 1000),
                (int) (Math.random() * 1000),
                (int) (Math.random() * 1000),
                (int) (Math.random() * 1000),
                (int) (Math.random() * 1000),
                (int) (Math.random() * 1000),
                (int) (Math.random() * 1000)

        };
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        System.out.println("--------------");
        swap(a);
        System.out.println(Arrays.toString(a));
    }

    public static void swap(int a[]) {
        int len = a.length;
        for (int i = 0; i < len / 2; i++) {
            int tmp = a[i];
            a[len - 1 - i] = tmp;
        }
    }
}
