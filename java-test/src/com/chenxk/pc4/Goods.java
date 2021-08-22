package com.chenxk.pc4;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/7/31 16:03
 */
public class Goods {
    private String brand;
    private  String name;

    public Goods(String brand, String name){
        this.brand = brand;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }
}
