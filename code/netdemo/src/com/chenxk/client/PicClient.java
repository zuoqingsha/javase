package com.chenxk.client;

import java.io.*;
import java.net.Socket;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/1 19:29
 */
public class PicClient {
    public static void main(String[] args) throws IOException {
        //创建图片的输入流对象
        FileInputStream fileInputStream = new FileInputStream("src/OIP.jpg");
        //创建Socket
        Socket client = new Socket("localhost",10086);
        //获取输出流对象
        OutputStream outputStream = client.getOutputStream();
        int temp = 0;
        while((temp = fileInputStream.read()) != -1){
            outputStream.write(temp);
        }
        client.shutdownOutput();
        //接受服务端的响应
        InputStream inputStream = client.getInputStream();
        byte[] buf = new byte[1024];
        int length = inputStream.read(buf);
        System.out.println(new String(buf,0,length));
        client.shutdownInput();

        outputStream.close();
        fileInputStream.close();
        client.close();
    }
}
