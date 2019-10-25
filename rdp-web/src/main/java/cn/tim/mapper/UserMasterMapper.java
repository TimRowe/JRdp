package cn.tim.mapper;

import cn.tim.model.UserMaster;

public interface UserMasterMapper {
    int deleteByPrimaryKey(String userId);

    int insert(UserMaster record);

    int insertSelective(UserMaster record);

    UserMaster selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UserMaster record);

    int updateByPrimaryKey(UserMaster record);
}