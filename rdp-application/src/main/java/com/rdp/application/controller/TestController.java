package com.rdp.application.controller;



import com.rdp.system.mapper.*;
import com.rdp.system.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author 10011531
 */
@RestController
public class TestController {

    class JsonObj{
        public String userName;
        public String userId;
    }

    @Autowired
    private UserService userService;


    @GetMapping(value = "/testObj")
    public JsonObj testObj() {
        return new JsonObj();
    }


    @GetMapping(value = "/test1")
    public String test1() {
        return userService.selectByPrimaryKey("10030753").getUserName();
    }


}