package com.oop.demo1213.demo3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GetNameTest {
    public static void main(String[] args) {


        Map results = new HashMap();
        InputStream ips = GetNameTest.class.getResourceAsStream("info.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(ips));
        String line = null;
        User u = new User();
        try {
            while ((line = in.readLine()) != null) {

                User.dealLine(line, results);

            }
            User.sortResults(results);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
