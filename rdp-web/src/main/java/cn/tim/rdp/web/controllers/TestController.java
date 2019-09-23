package cn.tim.rdp.web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value = "/test")
    public String Test() {
        return "222";
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