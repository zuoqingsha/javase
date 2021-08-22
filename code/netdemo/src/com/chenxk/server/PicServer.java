package com.chenxk.server;

import sun.reflect.generics.scope.Scope;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/1 19:36
 */
public class PicServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);

        Socket server = serverSocket.accept();
        //获取文件输入流对象
        InputStream inputStream = server.getInputStream();
        //创建文件输出流对象
        FileOutputStream fileOutputStream = new FileOutputStream("qige.jpg");
        int temp = 0;
        while ((temp = inputStream.read()) != -1){
            fileOutputStream.write(temp);
        }
        server.shutdownInput();
        //上传图片就素之后基于客户端响应
        OutputStream outputStream = server.getOutputStream();
        outputStream.write("上传成功".getBytes());
        server.shutdownOutput();

        outputStream.close();
        fileOutputStream.close();
        inputStream.close();
        server.close();
        serverSocket.close();

    }
}
