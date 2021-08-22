package com.chenxk.bean;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/15 19:23
 */
public class Address {
    private String province;
    private String city;

    public Address() {
    }

    public Address(String province, String city) {

        this.province = province;
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
