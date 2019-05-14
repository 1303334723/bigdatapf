package com.behavioranalysis.controller;

import com.behavioranalysis.pojo.*;
import com.behavioranalysis.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/session")
public class SessionController {
    @Autowired
    private SessionService sessionService;

    @RequestMapping(value = "/session-aggr-stats/{taskId}", method = RequestMethod.GET)
    public SessionAggrStat getSessionASByTaskId(@PathVariable("taskId") int taskId) {
        return sessionService.getSessionASByTaskId(taskId);
    }

    @RequestMapping(value = "/top10-category/{taskId}", method = RequestMethod.GET)
    public List<Top10Category> getTop10CategoryByTaskId(@PathVariable("taskId") int taskId) {
        return sessionService.getTop10CategoryByTaskId(taskId);
    }

    @RequestMapping(value = "/top10-category-session/{taskId}", method = RequestMethod.GET)
    public List<Top10CategorySession> getTop10CategorySessionByTaskId(@PathVariable("taskId") int taskId) {
        return sessionService.getTop10CategorySessionByTaskId(taskId);
    }

    @RequestMapping(value = "/session-random-extract/{taskId}", method = RequestMethod.GET)
    public List<SessionRandomExtract> getSessionRandomExtractByTaskId(@PathVariable("taskId") int taskId) {
       return sessionService.getSessionRandomExtractByTaskId(taskId);
    }

    @RequestMapping(value = "/session-detail/{sessionId}", method = RequestMethod.GET)
    public List<SessionDetail> getSessionDetailBySessionId(@PathVariable("sessionId") String sessionId) {
        return sessionService.getSessionDetailBySessionId(sessionId);
    }
}
