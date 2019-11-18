package com.rdp.system.service.impl;

import com.rdp.system.domain.RequestLog;
import com.rdp.system.service.RequestLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestLogServiceImpl implements RequestLogService {

    @Autowired
    private RequestLogMapper requestLogMapper;

    @Override
    public int deleteByPrimaryKey(String seq) {
        return requestLogMapper.deleteByPrimaryKey(seq);
    }

    @Override
    public int insert(RequestLog record) {
        return requestLogMapper.insert(record);
    }

    @Override
    public int insertSelective(RequestLog record) {
        return requestLogMapper.insertSelective(record);
    }

    @Override
    public RequestLog selectByPrimaryKey(String seq) {
        return requestLogMapper.selectByPrimaryKey(seq);
    }

    @Override
    public int updateByPrimaryKeySelective(RequestLog record) {
        return requestLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RequestLog record) {
        return requestLogMapper.updateByPrimaryKey(record);
    }
}