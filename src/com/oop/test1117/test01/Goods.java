package com.oop.test1117.test01;

public class Goods {
    private String goodsName;
    private String categoryName;

    public Goods() {
    }

    public Goods(String goodsName, String categoryName) {
        this.goodsName = goodsName;
        this.categoryName = categoryName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsName='" + goodsName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
