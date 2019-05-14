package com.behavioranalysis.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.behavioranalysis.mapper.TaskMapper;
import com.behavioranalysis.mapper.TimingTaskMapper;
import com.behavioranalysis.pojo.Task;
import com.behavioranalysis.pojo.TaskExample;
import com.behavioranalysis.pojo.TimingTaskExample;
import com.behavioranalysis.service.TaskService;
import com.behavioranalysis.util.DateUtils;
import com.behavioranalysis.util.ExecuteTask;
import com.behavioranalysis.util.ParamUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.unit.DataUnit;

import java.util.Date;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TimingTaskMapper timingTaskMapper;
    @Autowired
    private TaskMapper taskMapper;

    // 获取各类型任务总数
    @Override
    public int selectTimingTaskCounts() {
        TimingTaskExample timingTaskExample = new TimingTaskExample();
        return timingTaskMapper.countByExample(timingTaskExample);
    }

    @Override
    public int selectSessionTaskCounts() {
        TaskExample taskExample = new TaskExample();
        TaskExample.Criteria criteria = taskExample.createCriteria();
        criteria.andTaskTypeEqualTo("session分析");
        return taskMapper.countByExample(taskExample);
    }

    @Override
    public int selectPageConvertTaskCounts() {
        TaskExample taskExample = new TaskExample();
        TaskExample.Criteria criteria = taskExample.createCriteria();
        criteria.andTaskTypeEqualTo("页面单跳转化率");
        return taskMapper.countByExample(taskExample);
    }

    @Override
    public int selectProductTaskCounts() {
        TaskExample taskExample = new TaskExample();
        TaskExample.Criteria criteria = taskExample.createCriteria();
        criteria.andTaskTypeEqualTo("热门商品统计");
        return taskMapper.countByExample(taskExample);
    }

    // 提交task持久化

    @Override
    public Task addTaskAndExecute(Task record) {
        // 插入任务
        taskMapper.insertAndGetTaskId(record);
        System.out.println(record.toString());
        new Thread(new Runnable() {
            @Override
            public void run() {

                int result = -1;
                String startTime = "";
                String finishTime = "";

                // 根据任务类型执行shell脚本
                if ("session分析".equals(record.getTaskType())) {
                    try {
                        startTime = DateUtils.formatTime(new Date());
                        record.setTaskStatus("正在运行");
                        // 将此task从数据库更新
                        taskMapper.updateByPrimaryKeySelective(record);
                        System.out.println("=========== 开始执行脚本 ===========");
                        result = ExecuteTask.executeSessionTask(record.getTaskId());
                        System.out.println("=========== 脚本执行完成 ===========");
                        finishTime = DateUtils.formatTime(new Date());
                    } catch (Exception e) {
                        record.setTaskStatus("发生异常");
                        // 将此task从数据库更新
                        taskMapper.updateByPrimaryKeySelective(record);
                        System.out.println("=========== 脚本执行发生异常 ===========");
                        e.printStackTrace();
                    }
                } else if ("页面单跳转化率".equals(record.getTaskType())) {
                    try {
                        startTime = DateUtils.formatTime(new Date());
                        record.setTaskStatus("正在运行");
                        // 将此task从数据库更新
                        taskMapper.updateByPrimaryKeySelective(record);
                        System.out.println("=========== 开始执行脚本 ===========");
                        result = ExecuteTask.executePageTask(record.getTaskId());
                        System.out.println("=========== 脚本执行完成 ===========");
                        finishTime = DateUtils.formatTime(new Date());
                    } catch (Exception e) {
                        record.setTaskStatus("发生异常");
                        // 将此task从数据库更新
                        taskMapper.updateByPrimaryKeySelective(record);
                        System.out.println("=========== 脚本执行发生异常 ===========");
                        e.printStackTrace();
                    }
                } else if ("热门商品统计".equals(record.getTaskType())) {
                    try {
                        startTime = DateUtils.formatTime(new Date());
                        record.setTaskStatus("正在运行");
                        // 将此task从数据库更新
                        taskMapper.updateByPrimaryKeySelective(record);
                        System.out.println("=========== 开始执行脚本 ===========");
                        result = ExecuteTask.executeProductTask(record.getTaskId());
                        System.out.println("=========== 脚本执行完成 ===========");
                        finishTime = DateUtils.formatTime(new Date());
                    } catch (Exception e) {
                        record.setTaskStatus("发生异常");
                        // 将此task从数据库更新
                        taskMapper.updateByPrimaryKeySelective(record);
                        System.out.println("=========== 脚本执行发生异常 ===========");
                        e.printStackTrace();
                    }
                }
                System.out.println("shell脚本是否正常执行" + result);
                // 判断是否执行完成
                if (result == 0) {
                    record.setStartTime(startTime);
                    record.setFinishTime(finishTime);
                    record.setTaskStatus("完成");
                    System.out.println("=========== 脚本已成功执行结束 ===========");
                    // 将此task从数据库更新
                    taskMapper.updateByPrimaryKeySelective(record);
                } else {
                    // 未正常完成
                    record.setTaskStatus("未正常完成");
                    // 将此task从数据库更新
                    taskMapper.updateByPrimaryKeySelective(record);
                }
            }
        }).start();

        System.out.println("======= 脚本线程正在执行 =======");
        return record;
    }

    @Override
    public List<Task> getTasks(String taskType) {
        TaskExample taskExample = new TaskExample();
        TaskExample.Criteria criteria = taskExample.createCriteria();
        criteria.andTaskTypeEqualTo(taskType);
        List<Task> taskList = taskMapper.selectByExampleWithBLOBs(taskExample);
        for (Task task : taskList) {
            JSONObject taskParam = JSONObject.parseObject(task.getTaskParam());
            String startAge = ParamUtils.getParam(taskParam, "startAge");
            String endAge = ParamUtils.getParam(taskParam, "endAge");
            String startDate = ParamUtils.getParam(taskParam, "startDate");
            String endDate = ParamUtils.getParam(taskParam, "endDate");
            String targetPageFlow = ParamUtils.getParam(taskParam, "targetPageFlow");
            StringBuilder stringBuilder = new StringBuilder();
            if (targetPageFlow != null) {
                stringBuilder.append("页面流：" + targetPageFlow + "; ");
            }
            if (startAge != null) {
                stringBuilder.append("年龄范围：" + startAge + " - " + endAge + "; ");
            }
            if (startDate != null) {
                stringBuilder.append("日期范围：" + startDate + " - " + endDate);
            }
            task.setTaskParam(stringBuilder.toString());
        }
        return taskList;
    }
}
