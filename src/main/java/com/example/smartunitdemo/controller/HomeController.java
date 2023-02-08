package com.example.smartunitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.smartunitdemo.model.User;

/**
 * @author chenjie <chenjie09@kuaishou.com>
 * Created on 2023-02-08
 */
@RestController
public class HomeController {
    @GetMapping("/test1")
    public Object test1(String name){
        return name;
    }

    @PostMapping("/test2")
    public Object test2(@RequestBody String name){
        return name;
    }

    @PostMapping("/test3")
    public Object test2(@RequestBody User user){
        return user;
    }
}
