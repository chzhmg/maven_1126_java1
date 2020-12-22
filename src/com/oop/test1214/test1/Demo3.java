package com.oop.test1214.test1;

public class Demo3 {
    public void quickSort(String[] strData, int left, int right) {
        String middle, tempData;
        int i, j;
        i = left;
        j = right;
        middle = strData[(i + j) / 2];
        do {
            while (strData[i].compareTo(middle) < 0 && i < right) i++;
            while (strData[j].compareTo(middle) > 0 && j > left) j--;
            if (i <= j) {
                tempData = strData[i];
                strData[i] = strData[j];
                strData[j] = tempData;
                i++;
                j--;
            }


        } while (i <= j);
        if (i < right) {
            quickSort(strData, i, right);
        }
        if (j > left) {
            quickSort(strData, left, j);
        }
    }

    public static void main(String[] args) {
        String[]  strVoid = new String[]{"1","90","234","1","1","90"};
        Demo3 demo3 = new Demo3();
        demo3.quickSort(strVoid,0,strVoid.length-1);
        for (int i = 0; i < strVoid.length; i++) {
            System.out.println(strVoid[i]+" ");
        }
    }
}
