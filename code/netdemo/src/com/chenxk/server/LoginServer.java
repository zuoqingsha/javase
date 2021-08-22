package com.chenxk.server;

import com.chenxk.client.User;

import javax.xml.crypto.Data;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/1 20:14
 */
public class LoginServer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(10086);
        Socket server = serverSocket.accept();

        InputStream inputStream = server.getInputStream();
        //需要使用ObjectInputStream对象
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        User user = (User) objectInputStream.readObject();
        String str = "";
        if("chenxk".equals(user.getUsername()) && "123".equals(user.getPassword())){
            System.out.println("欢迎你："+user.getUsername());
            str = "登录成功";
        }else {
            str="登录失败";
        }
        //截断输入流
        server.shutdownInput();
        //给客户端响应
        DataOutputStream dataOutputStream = new DataOutputStream(server.getOutputStream());
        dataOutputStream.writeUTF(str);
        server.shutdownOutput();

        dataOutputStream.close();
        objectInputStream.close();
        inputStream.close();
        server.close();
        serverSocket.close();

    }
}

