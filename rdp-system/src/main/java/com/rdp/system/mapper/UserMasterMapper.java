package com.rdp.system.mapper;

import com.rdp.system.domain.UserMaster;

public interface UserMasterMapper {
    int deleteByPrimaryKey(String userId);

    int insert(UserMaster record);

    int insertSelective(UserMaster record);

    UserMaster selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UserMaster record);

    int updateByPrimaryKey(UserMaster record);
}