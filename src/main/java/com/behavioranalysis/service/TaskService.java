package com.behavioranalysis.service;

import com.behavioranalysis.pojo.Task;

import java.util.List;

public interface TaskService {

    /**
     * 查询TimingTaskCounts的总数
     * @return 数量
     */
    int selectTimingTaskCounts();

    /**
     * 查询session分析任务的数量
     * @return 数量
     */
    int selectSessionTaskCounts();

    /**
     * 查询页面单跳转化率任务的数量
     * @return 数量
     */
    int selectPageConvertTaskCounts();

    /**
     * 查询热门商品统计任务的数量
     * @return 数量
     */
    int selectProductTaskCounts();

    /**
     * 添加Task，并返回其taskId
     * @param record
     * @return
     */
    Task addTaskAndExecute(Task record);

    /**
     * 获取
     * @return
     */
    List<Task> getTasks(String taskType);
}
