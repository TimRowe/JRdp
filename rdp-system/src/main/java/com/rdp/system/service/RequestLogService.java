package com.rdp.system.service;

import com.rdp.system.domain.RequestLog;
import com.rdp.system.domain.UserMaster;

import java.util.List;

public interface RequestLogService {

    int deleteByPrimaryKey(String seq);

    int insert(RequestLog record);

    int insertSelective(RequestLog record);

    RequestLog selectByPrimaryKey(String seq);

    int updateByPrimaryKeySelective(RequestLog record);

    int updateByPrimaryKey(RequestLog record);

    int batchInsert(List<RequestLog> recordList);
}