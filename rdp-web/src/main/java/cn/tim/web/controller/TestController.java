package cn.tim.web.controller;

import cn.tim.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private User user;

    @GetMapping(value = "/test")
    public String Test() {
        return user.getName();
    }


    @GetMapping(value = "/test1")
    public String Test1() {
        return "HelloWorld123456";
    }

    @GetMapping(value = "/test2")
    public String Test3() {
        return "HelloWorld1234567";
    }
}