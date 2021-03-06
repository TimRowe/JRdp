package com.rdp.system.mapper;

import com.rdp.system.domain.RequestLog;

import java.util.List;

public interface RequestLogMapper {
    int deleteByPrimaryKey(String seq);

    int insert(RequestLog record);

    int insertSelective(RequestLog record);

    RequestLog selectByPrimaryKey(String seq);

    int updateByPrimaryKeySelective(RequestLog record);

    int updateByPrimaryKey(RequestLog record);

    int batchInsert(List<RequestLog> recordList);
}