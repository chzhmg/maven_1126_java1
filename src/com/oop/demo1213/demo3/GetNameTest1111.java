package com.oop.demo1213.demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GetNameTest1111 {
    public static void main(String[] args) {
        Map rs = new HashMap();
        InputStream ips = GetNameTest1111.class.getResourceAsStream("info.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(ips));
        String line = null;
        try {
            while ((line = in.readLine()) != null) {
                Users11.dealLine(line, rs);
            }
            Users11.sortResults(rs);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
