package com.oop.suanfa.test4;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileManager {
    String[] words = null;
    int pos = 0;

    public FileManager(String fName, char[] st) throws IOException {
        File f = new File(fName);
        FileReader reader = new FileReader(f);
        char[] buf = new char[(int) f.length()];
        int len = reader.read(buf);
        String res = new String(buf, 0, len);
        String reg = null;
        if (st.length > 1) {
            reg = "" + st[0] + "|" + st[1];
        } else {
            reg = "" + st[0];
        }
        words = res.split(reg);
    }

    public String nextWords() {
        if (pos == words.length) {
            return null;
        }
        return words[pos++];
    }
}
