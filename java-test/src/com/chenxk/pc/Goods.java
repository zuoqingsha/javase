package com.chenxk.pc;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/7/29 22:29
 */
public class Goods {

    private String brand;
    private String name;

    public Goods(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    public Goods() {

    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }
}
