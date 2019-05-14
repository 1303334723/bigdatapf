package com.behavioranalysis.test;

import com.behavioranalysis.util.RemoteShellExecutor;

public class RemoteShellExecutorTest {
    public static void main(String[] args) throws Exception {
        RemoteShellExecutor executor = new RemoteShellExecutor(
                "192.168.43.111", "root", "root");
        System.out.println(executor.exec(
                "/home/test/shellStudy/stop-all-cluster.sh"
        ));
    }
}
