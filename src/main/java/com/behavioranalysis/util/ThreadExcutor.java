package com.behavioranalysis.util;

import com.behavioranalysis.pojo.Task;

public class ThreadExcutor extends Thread{
    private Task record;

    public void setRecord(Task record) {
        this.record = record;
    }

    @Override
    public void run() {

    }
}
