package com.chenxk;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/1 18:38
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        InetAddress inetAdd = InetAddress.getByName("192.168.31.189");
        System.out.println(inetAdd);
        System.out.println(inetAdd.getHostAddress());
        System.out.println(inetAdd.getHostName());

    }
}
