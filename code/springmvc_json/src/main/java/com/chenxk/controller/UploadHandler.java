package com.chenxk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/21 8:11
 */
@Controller
public class UploadHandler {
    @RequestMapping("/testUpload")
    public String testUpload(@RequestParam(value = "desc", required = false) String desc,
                             @RequestParam("file")MultipartFile multipartFile) throws IOException {
        System.out.println("desc: " + desc);
        System.out.println("OriginalFileName: " + multipartFile.getOriginalFilename());
        multipartFile.transferTo(new File("D:\\file\\"+multipartFile.getOriginalFilename()));
        return "success";
    }

    @RequestMapping("/testUploads")
    public String testUpload(@RequestParam(value = "desc", required = false) String desc,
                             @RequestParam("file")MultipartFile[] multipartFiles) throws IOException{
        System.out.println("desc: " + desc);
        for (MultipartFile file : multipartFiles) {
            if(!file.isEmpty()){
                System.out.println("OriginalFileName: " + file.getOriginalFilename());
                file.transferTo(new File("D:\\file\\"+file.getOriginalFilename()));
            }
        }
        return "success";
    }
}
