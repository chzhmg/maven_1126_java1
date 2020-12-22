package com.oop.demo1213.demo3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GetNameTest1 {
    public static void main(String[] args) {
        Map res = new HashMap();
        InputStream ips = GetNameTest.class.getResourceAsStream("info.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(ips));
        String line ;
        try {
            while ((line = in.readLine()) != null) {
                Users.dealLine(line, res);
            }
            Users.sortResults(res);
        } catch (Exception e) {

        }
    }
}
