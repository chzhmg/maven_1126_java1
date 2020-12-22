package com.oop.demo1213.demo3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class Users {
    public String name;
    public Integer value;

    public Users(String name, Integer value) {
        this.name = name;
        this.value = value;


    }

    public static void sortResults(Map results) {
        TreeSet sortResults = new TreeSet<>(
                new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        Users user1 = (Users) o1;
                        Users user2 = (Users) o2;
                        if (user1.value < user2.value) {
                            return -1;
                        } else if (user1.value > user2.value) {
                            return 1;
                        } else {
                            return user1.name.compareTo(user2.name);
                        }
                    }
                }
        );
        Iterator it = results.keySet().iterator();
        while (it.hasNext()) {
            String name = (String) it.next();
            Integer value = (Integer) results.get(name);
            if (value > 1) {
                sortResults.add(new Users(name, value));
            }
        }
        printResults(sortResults);
    }

    private static void printResults(TreeSet sortedResults) {

        Iterator it = sortedResults.iterator();
        while (it.hasNext()) {
            Users user = (Users) it.next();
            System.out.println(user.name + ":" + user.value);

        }
    }

    public static void dealLine(String line, Map map) {
        if (!"".equals(line.trim())) {
            String[] results = line.split(", ");
            if (results.length == 3) {
                String name = results[1];
                Integer value = (Integer) map.get(name);
                if (value == null) value = 0;
                map.put(name, value + 1);
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = super.equals(obj);
        System.out.println(result);
        return result;
    }
}
