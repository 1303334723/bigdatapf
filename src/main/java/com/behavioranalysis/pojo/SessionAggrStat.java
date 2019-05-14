package com.behavioranalysis.pojo;

public class SessionAggrStat {
    private Integer taskId;

    private Integer sessionCount;

    private Double s1_s3;

    private Double s4_s6;

    private Double s7_s9;

    private Double s10_s30;

    private Double s30_s60;

    private Double m1_m3;

    private Double m3_m10;

    private Double m10_m30;

    private Double m30;

    private Double s1_3;

    private Double s4_6;

    private Double s7_9;

    private Double s10_30;

    private Double s30_60;

    private Double s60;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getSessionCount() {
        return sessionCount;
    }

    public void setSessionCount(Integer sessionCount) {
        this.sessionCount = sessionCount;
    }

    public Double getS1_s3() {
        return s1_s3;
    }

    public void setS1_s3(Double s1_s3) {
        this.s1_s3 = s1_s3;
    }

    public Double getS4_s6() {
        return s4_s6;
    }

    public void setS4_s6(Double s4_s6) {
        this.s4_s6 = s4_s6;
    }

    public Double getS7_s9() {
        return s7_s9;
    }

    public void setS7_s9(Double s7_s9) {
        this.s7_s9 = s7_s9;
    }

    public Double getS10_s30() {
        return s10_s30;
    }

    public void setS10_s30(Double s10_s30) {
        this.s10_s30 = s10_s30;
    }

    public Double getS30_s60() {
        return s30_s60;
    }

    public void setS30_s60(Double s30_s60) {
        this.s30_s60 = s30_s60;
    }

    public Double getM1_m3() {
        return m1_m3;
    }

    public void setM1_m3(Double m1_m3) {
        this.m1_m3 = m1_m3;
    }

    public Double getM3_m10() {
        return m3_m10;
    }

    public void setM3_m10(Double m3_m10) {
        this.m3_m10 = m3_m10;
    }

    public Double getM10_m30() {
        return m10_m30;
    }

    public void setM10_m30(Double m10_m30) {
        this.m10_m30 = m10_m30;
    }

    public Double getM30() {
        return m30;
    }

    public void setM30(Double m30) {
        this.m30 = m30;
    }

    public Double getS1_3() {
        return s1_3;
    }

    public void setS1_3(Double s1_3) {
        this.s1_3 = s1_3;
    }

    public Double getS4_6() {
        return s4_6;
    }

    public void setS4_6(Double s4_6) {
        this.s4_6 = s4_6;
    }

    public Double getS7_9() {
        return s7_9;
    }

    public void setS7_9(Double s7_9) {
        this.s7_9 = s7_9;
    }

    public Double getS10_30() {
        return s10_30;
    }

    public void setS10_30(Double s10_30) {
        this.s10_30 = s10_30;
    }

    public Double getS30_60() {
        return s30_60;
    }

    public void setS30_60(Double s30_60) {
        this.s30_60 = s30_60;
    }

    public Double getS60() {
        return s60;
    }

    public void setS60(Double s60) {
        this.s60 = s60;
    }

    @Override
    public String toString() {
        return "SessionAggrStat{" +
                "taskId=" + taskId +
                ", sessionCount=" + sessionCount +
                ", s1_s3=" + s1_s3 +
                ", s4_s6=" + s4_s6 +
                ", s7_s9=" + s7_s9 +
                ", s10_s30=" + s10_s30 +
                ", s30_s60=" + s30_s60 +
                ", m1_m3=" + m1_m3 +
                ", m3_m10=" + m3_m10 +
                ", m10_m30=" + m10_m30 +
                ", m30=" + m30 +
                ", s1_3=" + s1_3 +
                ", s4_6=" + s4_6 +
                ", s7_9=" + s7_9 +
                ", s10_30=" + s10_30 +
                ", s30_60=" + s30_60 +
                ", s60=" + s60 +
                '}';
    }
}