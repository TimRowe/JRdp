package cn.tim.web.controller;

import cn.tim.mapper.UserMasterMapper;
import cn.tim.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rdp.spring.demo.User2Impl;
import rdp.spring.demo.UserImpl;


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
    private User user;

    @Autowired
    private UserMasterMapper userMasterMapper;

    @Autowired
    private UserImpl userImpl;

    @GetMapping(value = "/test")
    public String test() {
        return user.getName();
    }

    @GetMapping(value = "/testObj")
    public JsonObj testObj() {
        return new JsonObj();
    }


    @GetMapping(value = "/test1")
    public String test1() {
        return userMasterMapper.selectByPrimaryKey("10030753").getUserName();
    }

    @GetMapping(value = "/test2")
    public String test3() {
        return userImpl.getName();
    }
}