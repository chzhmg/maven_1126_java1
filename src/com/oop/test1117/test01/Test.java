package com.oop.test1117.test01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        //创建五个商品
        Goods g1 = new Goods("冰红茶", "饮品");
        Goods g2 = new Goods("方便面", "食品");
        Goods g3 = new Goods("咖啡", "饮品");
        Goods g4 = new Goods("洗衣粉", "日用品");
        Goods g5 = new Goods("火腿肠", "食品");
        //创建List集合
        List<Goods> goodsList = new ArrayList<Goods>();
        Map<String, String> map = new HashMap<String, String>();
        goodsList.add(g1);
        goodsList.add(g2);
        goodsList.add(g3);
        goodsList.add(g4);
        goodsList.add(g5);
        for (Goods g : goodsList) {
            String goodsName = g.getGoodsName();
            String categoryName = g.getCategoryName();
            if (map.containsKey(categoryName)) {

                String goodsNames = map.get(categoryName);

                goodsNames = goodsNames + "," + goodsName;
                map.put(categoryName, goodsNames);

            } else {
                map.put(categoryName, goodsName);
            }
        }
        for (String key : map.keySet()) {
            System.out.println(key + "---- " + map.get(key));
        }
    }
}
