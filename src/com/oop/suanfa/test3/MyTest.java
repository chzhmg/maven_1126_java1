package com.oop.suanfa.test3;

import java.io.FileWriter;
import java.io.IOException;

public class MyTest {
    public static void main(String[] args) throws IOException {
        FileManager am = new FileManager("D:/test/a.txt", new char[]{'\n'});
        FileManager bm = new FileManager("D:/test/b.txt", new char[]{'\n'});
        String file = "d:/test/c.txt";
        FileWriter cw = new FileWriter(file);
        String aWords = null;
        String bWords = null;
        while ((aWords = am.nextWord()) != null) {
            cw.write(aWords + "\n");
            bWords = bm.nextWord();
            if (bWords != null) {
                cw.write(bWords + "\n");
            }
        }
        while ((bWords = bm.nextWord()) != null) {
            cw.write(bWords + "\n");
        }
        cw.close();
    }
}
