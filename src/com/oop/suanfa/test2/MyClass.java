package com.oop.suanfa.test2;

import java.io.FileWriter;
import java.io.IOException;

public class MyClass {
    public static void main(String[] args) throws IOException {
        FileManager a = new FileManager("d:/test/a.txt", new char[]{'\n'});
        FileManager b = new FileManager("d:/test/b.txt", new char[]{'\n'});
        FileWriter c = new FileWriter("d:/test/c.txt");
        String aWords = null;
        String bWords = null;
        while ((aWords = a.nextWord()) != null) {
            c.write(aWords + "\n");
            bWords = b.nextWord();
            if (bWords != null) {
                c.write(bWords + "\n");
            }
        }
        while ((bWords = b.nextWord()) != null) {
            c.write(bWords + "\n");
        }
        c.close();
    }
}
