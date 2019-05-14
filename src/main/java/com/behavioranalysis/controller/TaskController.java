package com.behavioranalysis.controller;


import com.behavioranalysis.pojo.Task;
import com.behavioranalysis.service.TaskService;
import com.behavioranalysis.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    TaskService taskService;

    // 获取各类型task的总数

    @RequestMapping(value = "/timingTaskCounts", method = RequestMethod.GET)
    public int selectTimingTaskCounts() {
        return taskService.selectTimingTaskCounts();
    }

    @RequestMapping(value = "/sessionTaskCounts", method = RequestMethod.GET)
    public int selectSessionTaskCounts() {
        return taskService.selectSessionTaskCounts();
    }

    @RequestMapping(value = "/pageConvertTaskCounts", method = RequestMethod.GET)
    public int selectPageConvertTaskCounts() {
        return taskService.selectPageConvertTaskCounts();
    }

    @RequestMapping(value = "/productTaskCounts", method = RequestMethod.GET)
    public int selectProductTaskCounts() {
        return taskService.selectProductTaskCounts();
    }

    // 添加task
    /**
     * 每个离线模块中，新建task，旁 都应该有一个 此模块 分析task 按钮，
     *  点击弹出模态窗 展示此模块中的所有task，后面有操作栏 查看结果，会将此taskid的分析结果渲染在图标。
     *
     * 前台提交异步task后，会一直等待 message 返回（异步等待时间设大），但这时可以操作其他的页面。
     *  但这时如何通知我们此任务分析完成或者发生异常呢？
     *      不管完成或是发生异常，此controller都会返回此task，
     *      ajax,有error和success方法，无论执行那个方法，
     *      执行体中将所获的message 渲染到右上角的铃铛处，
     *      提醒我们，任务的进展情况。
     *
     * ajax提交任务后，另起一个线程执行shell脚本，任务开始执行时，返回给该ajax成功启动任务。
     *
     *
     */

    @RequestMapping(value = "/sessiontask/add", method = RequestMethod.POST)
    public Task addSessionTask(@RequestParam(name = "task_name") String taskName,
                              @RequestParam(name = "task_type") String taskType,
                              @RequestParam(name = "startAge") String startAge,
                              @RequestParam(name = "endAge") String endAge,
                              @RequestParam(name = "dateRange") String dateRange) {
        Task createSessionTask = new Task();
        createSessionTask.setTaskName(taskName);
        createSessionTask.setCreateTime(DateUtils.formatTime(new Date()));
        createSessionTask.setTaskType(taskType);
        createSessionTask.setTaskStatus("新建");
        String startDate = dateRange.split(" - ")[0];
        String endDate = dateRange.split(" - ")[1];
        String taskParam = "{\"startAge\":[\"" + startAge + "\"],\"endAge\":[\"" + endAge +
                "\"],\"startDate\":[\"" + startDate + "\"],\"endDate\":[\"" + endDate + "\"]}";
        createSessionTask.setTaskParam(taskParam);

        // 返回提交的task
        return taskService.addTaskAndExecute(createSessionTask);
    }

    @RequestMapping(value = "/pagetask/add", method = RequestMethod.POST)
    public Task addPageTask(@RequestParam(name = "task_name") String taskName,
                              @RequestParam(name = "task_type") String taskType,
                              @RequestParam(name = "targetPageFlow") String targetPageFlow,
                            @RequestParam(name = "dateRange") String dateRange) {

        Task createPageTask = new Task();
        createPageTask.setTaskName(taskName);
        createPageTask.setCreateTime(DateUtils.formatTime(new Date()));
        createPageTask.setTaskType(taskType);
        createPageTask.setTaskStatus("新建");
        String startDate = dateRange.split(" - ")[0];
        String endDate = dateRange.split(" - ")[1];
        String taskParam = "{\"targetPageFlow\":[\""  + targetPageFlow +
                "\"],\"startDate\":[\"" + startDate + "\"],\"endDate\":[\"" + endDate + "\"]}";
        createPageTask.setTaskParam(taskParam);
        return taskService.addTaskAndExecute(createPageTask);
    }

    @RequestMapping(value = "/producttask/add", method = RequestMethod.POST)
    public Task addProductTask(@RequestParam(name = "task_name") String taskName,
                              @RequestParam(name = "task_type") String taskType,
                               @RequestParam(name = "dateRange") String dateRange) {

        Task createProductTask = new Task();
        createProductTask.setTaskName(taskName);
        createProductTask.setCreateTime(DateUtils.formatTime(new Date()));
        createProductTask.setTaskType(taskType);
        createProductTask.setTaskStatus("新建");
        String startDate = dateRange.split(" - ")[0];
        String endDate = dateRange.split(" - ")[1];
        String taskParam = "{\"startDate\":[\"" + startDate + "\"],\"endDate\":[\"" + endDate + "\"]}";
        createProductTask.setTaskParam(taskParam);
        return taskService.addTaskAndExecute(createProductTask);
    }

    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    public List<Task> getTasks(@RequestParam(name = "task_type") String taskType) {
        return taskService.getTasks(taskType);
    }
}
