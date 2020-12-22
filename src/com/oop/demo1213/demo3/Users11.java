package com.oop.demo1213.demo3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class Users11 {
    public String name;
    public Integer value;

    public Users11(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public static void sortResults(Map res) {
        TreeSet sortResults = new TreeSet(
                new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {

                        Users11 u1 = (Users11) o1;
                        Users11 u2 = (Users11) o2;
                        if (u1.value < u2.value) {
                            return -1;
                        } else if (u1.value > u2.value) {
                            return 1;
                        } else {
                            return u1.name.compareTo(u2.name);
                        }
                    }
                }
        );
        Iterator it = res.keySet().iterator();
        while (it.hasNext()) {
            String name = (String) it.next();
            Integer value = (Integer) res.get(name);
            if (value > 1) {
                sortResults.add(new Users11(name, value));
            }
        }
        printResults(sortResults);

    }

    private static void printResults(TreeSet sortedResults) {
        Iterator it = sortedResults.iterator();
        while (it.hasNext()) {
            Users11 user = (Users11) it.next();
            System.out.println(user.name + ":" + user.value);
        }
    }

    public static void dealLine(String line, Map map) {
        if (!"".equals(line.trim())) {
            String[] res = line.split(",");
            if (res.length == 3) {
                String name = res[1];
                Integer value = (Integer) map.get(name);
                if (value == null) {
                    value = 0;
                }
                map.put(name, value + 1);
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        boolean res = super.equals(obj);
        System.out.println(res);
        return res;
    }
}
