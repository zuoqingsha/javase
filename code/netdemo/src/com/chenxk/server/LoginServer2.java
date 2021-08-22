package com.chenxk.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/3 7:16
 */
public class LoginServer2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        while (true){
            Socket socket = serverSocket.accept();
            LoginThread loginThread = new LoginThread(socket);
            new Thread(loginThread).start();
        }
    }
}
