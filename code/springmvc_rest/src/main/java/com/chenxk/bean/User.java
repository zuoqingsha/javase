package com.chenxk.bean;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/15 11:25
 */
public class User {
    private Integer id;
    private String userName;
    private String password;
    private Address address;

    public User(Integer id, String userName, String password, Address address) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.address = address;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", address=" + address +
                '}';
    }
}
