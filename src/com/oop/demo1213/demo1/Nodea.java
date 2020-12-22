package com.oop.demo1213.demo1;

public class Nodea {
    public int value;
    public Node left;
    public Node rigth;

    public static void main(String[] args) {
        int[] data = new int[20];
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) ((Math.random() * 100) + 1);
            System.out.print(data[i] + ",");
        }
        System.out.println();
        Node root = new Node();
        root.value = data[0];
        for (int i = 0; i < data.length; i++) {
            root.store(data[i]);
        }
        root.find(data[19]);
        root.preList();
        System.out.println();
        root.middleList();
        System.out.println();
        root.afterList();
    }

    public void store(int value) {
        if (value < this.value) {
            if (left == null) {


                left.value = value;
            } else {
                left.store(value);
            }
        } else if (value > this.value) {
            if (rigth == null) {
                rigth = new Node();
                rigth.value = value;
            } else {
                rigth.store(value);
            }
        }
    }

    public boolean find(int value) {
        System.out.println("happen " + this.value);
        if (value == this.value) {
            return true;
        } else if (value > this.value) {
            if (rigth == null) {
                return false;
            }
            return rigth.find(value);

        } else {
            if (left == null) {
                return false;
            }
        }
        return left.find(value);
    }

    public void preList() {
        System.out.print(this.value + ",");
        if (left != null) {
            left.preList();
        }
        if (rigth != null) {
            rigth.preList();
        }
    }

    public void middleList() {
        if (left != null) {
            left.preList();
        }
        System.out.print(this.value + ",");
        if (rigth != null) {
            rigth.preList();
        }
    }

    public void afterList() {
        if (left != null) {
            left.preList();
        }
        if (rigth != null) {
            rigth.preList();
        }
        System.out.print(this.value + ",");
    }
}
