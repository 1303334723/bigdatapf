package com.behavioranalysis.pojo;

public class PageSplitConvertRate {
    private Integer taskid;

    private String convertRate;

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public String getConvertRate() {
        return convertRate;
    }

    public void setConvertRate(String convertRate) {
        this.convertRate = convertRate == null ? null : convertRate.trim();
    }
}