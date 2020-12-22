package com.oop.test1123.test1;

public class test {
    class father {
        String name;

        public father(String name) {
            this.name = name;
        }

        public void test() {
            System.out.println("fa" + name);
        }
    }

    class son extends father {
        public son(String name) {
            super(name);
        }
    }
}
