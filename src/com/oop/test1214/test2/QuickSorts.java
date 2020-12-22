package com.oop.test1214.test2;

public class QuickSorts {
    public static void main(String[] args) {
        String[] strVoid = new String[]{"12", "32","12", "54", "67", "76"};

        QuickSorts sorts = new QuickSorts();
        sorts.quickSort(strVoid, 0, strVoid.length - 1);
        for (int i = 0; i < strVoid.length; i++) {
            System.out.print(strVoid[i] + " ");
        }
    }

    public void quickSort(String[] strDate, int left, int right) {
        String middle, tempDate;
        int i, j;
        i = left;
        j = right;
        middle = strDate[(i + j) / 2];
        do {
            while (strDate[i].compareTo(middle) < 0 && i < right)
                i++;
            while (strDate[j].compareTo(middle) > 0 && j > left)
                j--;
            if (i <= j) {
                tempDate = strDate[i];
                strDate[i] = strDate[j];
                strDate[j] = tempDate;
                i++;
                j--;
            }

        } while (i <= j);
        if (i < right) {
            quickSort(strDate, i, right);
        }
        if (j > left) {
            quickSort(strDate, left, j);
        }
    }

}
