package com.behavioranalysis.service;

import com.behavioranalysis.pojo.*;

import java.util.List;

public interface SessionService {

    public SessionAggrStat getSessionASByTaskId(int taskId);

    public List<Top10Category> getTop10CategoryByTaskId(int taskId);

    public List<Top10CategorySession> getTop10CategorySessionByTaskId(int taskId);

    public List<SessionRandomExtract> getSessionRandomExtractByTaskId(int taskId);

    public List<SessionDetail> getSessionDetailBySessionId(String sessionId);

}
