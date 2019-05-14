package com.behavioranalysis.service.impl;

import com.behavioranalysis.mapper.*;
import com.behavioranalysis.pojo.*;
import com.behavioranalysis.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionServiceImpl implements SessionService {
    @Autowired
    private SessionAggrStatMapper sessionAggrStatMapper;
    @Autowired
    private Top10CategoryMapper top10CategoryMapper;
    @Autowired
    private Top10CategorySessionMapper top10CategorySessionMapper;
    @Autowired
    private SessionRandomExtractMapper sessionRandomExtractMapper;
    @Autowired
    private SessionDetailMapper sessionDetailMapper;

    @Override
    public SessionAggrStat getSessionASByTaskId(int taskId) {
        SessionAggrStatExample sessionAggrStatExample = new SessionAggrStatExample();
        SessionAggrStatExample.Criteria criteria = sessionAggrStatExample.createCriteria();
        criteria.andTaskIdEqualTo(taskId);
        return sessionAggrStatMapper.selectByExample(sessionAggrStatExample).get(0);
    }

    @Override
    public List<Top10Category> getTop10CategoryByTaskId(int taskId) {
        Top10CategoryExample top10CategoryExample = new Top10CategoryExample();
        Top10CategoryExample.Criteria criteria = top10CategoryExample.createCriteria();
        criteria.andTaskIdEqualTo(taskId);
        return top10CategoryMapper.selectByExample(top10CategoryExample);
    }

    @Override
    public List<Top10CategorySession> getTop10CategorySessionByTaskId(int taskId) {
        Top10CategorySessionExample top10CategorySessionExample = new Top10CategorySessionExample();
        Top10CategorySessionExample.Criteria criteria = top10CategorySessionExample.createCriteria();
        criteria.andTaskIdEqualTo(taskId);
        return top10CategorySessionMapper.selectByExample(top10CategorySessionExample);
    }

    @Override
    public List<SessionRandomExtract> getSessionRandomExtractByTaskId(int taskId) {
        SessionRandomExtractExample sessionRandomExtractExample = new SessionRandomExtractExample();
        SessionRandomExtractExample.Criteria criteria = sessionRandomExtractExample.createCriteria();
        criteria.andTaskIdEqualTo(taskId);
        return sessionRandomExtractMapper.selectByExample(sessionRandomExtractExample);
    }

    @Override
    public List<SessionDetail> getSessionDetailBySessionId(String sessionId) {
        SessionDetailExample sessionDetailExample = new SessionDetailExample();
        SessionDetailExample.Criteria criteria = sessionDetailExample.createCriteria();
        criteria.andSessionIdEqualTo(sessionId);
        return sessionDetailMapper.selectByExample(sessionDetailExample);
    }
}
