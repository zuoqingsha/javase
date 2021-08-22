package com.chenxk.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/1 19:02
 */
public class Server2 {
    public static void main(String[] args) throws IOException {
        //服务端需要使用serversocket来开放本地接口
        ServerSocket serverSocket = new ServerSocket(10001);
        //需要接收client传输过来的数据，需要定义socket对象
        Socket server = serverSocket.accept();
        //通过server获取输入流对象
        InputStream inputStream = server.getInputStream();
        //------接收客户端数据-------------
        byte[] buf = new byte[1024];
        int length = inputStream.read(buf);
        System.out.println("客户端传输的数据是："+new String(buf,0,length));
        //-----------返回客户端数据-------------
        OutputStream outputStream = server.getOutputStream();
        outputStream.write("你好，收到".getBytes());
        //关闭所有的流操作
        outputStream.close();
        inputStream.close();
        server.close();
        serverSocket.close();

    }
}
