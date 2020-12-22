package com.oop.suanfa.test3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileManager {
    String[] words = null;
    int pos = 0;

    public FileManager(String fileName, char[] seperators) throws IOException {
        File f = new File(fileName);
        FileReader reader = new FileReader(f);
        char[] buf = new char[(int) f.length()];
        int len = reader.read(buf);
        String res = new String(buf, 0, len);
        String regex = null;
        if (seperators.length > 1) {
            regex = "" + seperators[0] + "|" + seperators[1];
        } else {
            regex = "" + seperators[0];
        }
        words = res.split(regex);
    }

    public String nextWord() {
        if (pos == words.length) {
            return null;
        }
        return words[pos++];
    }
}
