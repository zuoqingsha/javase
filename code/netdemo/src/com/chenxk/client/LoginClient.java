package com.chenxk.client;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/1 20:03
 */
public class LoginClient {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",10086);
        OutputStream outputStream = client.getOutputStream();
        //完成登录功能，需要传输一个user对象
        User user = getUser();
        //传输对象需要ObjectOutPutStream
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(user);
        //调用shuntdown方法告诉对方传输完成
        client.shutdownOutput();

        //接受响应
        DataInputStream dataInputStream = new DataInputStream(client.getInputStream());
        String str = dataInputStream.readUTF();
        System.out.println(str);

        dataInputStream.close();
        objectOutputStream.close();
        outputStream.close();
        client.close();

    }

    public static User getUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入密码：");
        String password = scanner.nextLine();
        return new User(username,password);
    }
}
