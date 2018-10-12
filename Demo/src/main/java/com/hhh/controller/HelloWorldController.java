package com.hhh.controller;

import com.hhh.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(value = "/hello")
    public String index(){
        return "Hello World!";
    }

    @RequestMapping(value = "/showUser")
    public User showUser(){
        User user=new User();
        user.setId(1);
        user.setName("sdsd");
        user.setPassword("sdsad");
        return user;
    }

}
