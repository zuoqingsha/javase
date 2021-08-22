package com.chenxk.server;

import com.chenxk.client.User;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/3 7:05
 */
public class LoginThread implements Runnable {

    private Socket socket;

    public LoginThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        ObjectInputStream objectInputStream = null;
        DataOutputStream dataOutputStream = null;

        try {
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            User user = (User) objectInputStream.readObject();
            String str = "";
            if("chenxk".equals(user.getUsername()) && "123".equals(user.getPassword())){
                System.out.println("欢迎您："+user.getUsername());
                str = "登录成功";
            }else{
                str="登录失败";
            }
            socket.shutdownInput();
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF(str);
            socket.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                dataOutputStream.close();
                objectInputStream.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
