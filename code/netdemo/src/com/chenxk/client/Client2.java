package com.chenxk.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/1 19:10
 */
public class Client2 {
    public static void main(String[] args) throws IOException {
        //创建客户端的套接字
        Socket client = new Socket("127.0.0.1", 10001);
        //----------向外输出-----------------
        //获取输出流对象
        OutputStream outputStream = client.getOutputStream();
        //数据输出
        outputStream.write("hello java".getBytes());

        //----------接收服务端返回的消息---------
        //获取输出流对象
        InputStream inputStream = client.getInputStream();
        byte[] buf = new byte[1024];
        int length = inputStream.read(buf);
        System.out.println("服务端的响应数据是：" + new String(buf,0, length));

        //关闭流操作
        inputStream.close();
        outputStream.close();
        client.close();
    }
}
