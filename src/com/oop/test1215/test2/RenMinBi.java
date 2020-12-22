package com.oop.test1215.test2;

public class RenMinBi {
    public static final char[] data = new char[]{
            '零', '壹', '贰', '叁', '肆', '伍', '陆',
            '柒', '捌', '玖'
    };
    public static final char[] units = new char[]{
            '元', '拾', '佰', '仟', '万','拾','佰','仟', '亿'
    };

    public static void main(String[] args) {
        System.out.println(convert(21312312));
    }

    public static String convert(int money) {
        StringBuffer buf = new StringBuffer();
        int unis = 0;
        while (money != 0) {
            buf.insert(0, units[unis++]);
            int number = money % 10;
            buf.insert(0, data[number]);
            money /= 10;
        }
        return buf.toString();
    }

}
