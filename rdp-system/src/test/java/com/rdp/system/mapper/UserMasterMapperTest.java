package com.rdp.system.mapper;

import com.rdp.system.domain.UserMaster;
import com.rdp.system.test.MybatisXmlApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisXmlApplication.class)
public class UserMasterMapperTest {

    @Autowired
    private UserMasterMapper userMapper;

    @Test
    @Transactional
    public void testInsert() throws Exception {
        var userMaster = new UserMaster();
        userMaster.setUserId("99995546");
        userMaster.setUserName("陈静");
        userMaster.setPassword("abcd@1234");
        userMaster.setBranchCode(3694);
        userMaster.setIpAddress("127.0.0.1");
        userMaster.setReaderType((short) 1);
        userMaster.setEmailAdd("303051991@qq.com");
        userMaster.setPasswordExprityDate(new Date());
        userMaster.setStatusFlag((byte)0);

        userMapper.insert(userMaster);
        Assert.assertEquals("陈静", userMapper.selectByPrimaryKey("99995546").getUserName());
    }

    @Test
    public void testQuery() throws Exception {

    }


    @Test
    public void testUpdate() throws Exception {

    }

}