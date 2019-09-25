package cn.tim.service;

import org.springframework.stereotype.Service;

@Service
public class UserImpl implements  User{
    @Override
    public String getName() {
        return "I am UserImpl";
    }
}
