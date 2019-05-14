package com.behavioranalysis.service;

import com.behavioranalysis.pojo.PageSplitConvertRate;

public interface PageService {
    public PageSplitConvertRate getPageSCRByTaskId(int taskId);
}
