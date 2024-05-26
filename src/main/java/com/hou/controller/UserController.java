package com.hou.controller;

import com.hou.pojo.People;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/**/getuser")
    public String getUser(){
        People p=new People();
        p.setName("侯永健");
        p.setAge(39);
        return p.toString();
    }
}
