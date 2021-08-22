package com.chenxk.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/21 6:57
 */
@Controller
public class DownloadController {
    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(HttpServletRequest request) throws IOException {
        //获取要下载文件的路径及输入流对象
        ServletContext servletContext;
        servletContext = request.getServletContext();
        String realPath = servletContext.getRealPath("/scripts/jquery-3.6.0.min.js");
        FileInputStream fileInputStream = new FileInputStream(realPath);

        byte[] bytes = new byte[fileInputStream.available()];
        fileInputStream.read(bytes);
        fileInputStream.close();
        //将要下载文件内容返回
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Content-Disposition","attachment;filename=jquery-3.6.0.min.js");
        return new ResponseEntity<byte[]>(bytes,httpHeaders, HttpStatus.OK);
    }
}
