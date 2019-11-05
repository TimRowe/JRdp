package com.rdp.service;

import org.springframework.stereotype.Service;

/**
 * @author 10011531
 */
@Service("UserImplService")
public class UserImpl implements  User{
    @Override
    public String getName() {
        return "I am UserImpl";
    }
}
