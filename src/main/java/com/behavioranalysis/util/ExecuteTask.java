package com.behavioranalysis.util;

public class ExecuteTask {

    /**
     * 远程主机执行session分析任务
     * @param taskId 任务id
     * @return 状态码：0 成功执行
     * @throws Exception
     */
    public static int executeSessionTask(int taskId) throws Exception {
        RemoteShellExecutor executor = new RemoteShellExecutor(
                "192.168.43.111", "root", "root");
        String command =
                "/usr/flink-1.6.1-hadoop27/bin/flink run " +
                "/home/produce_env/taskjar/session_analyze-1.0.jar --input "
                        + taskId;
        return executor.exec(command);
    }

    /**
     * 远程主机执行页面单跳转化率统计任务
     * @param taskId 任务id
     * @return 状态码：0 成功执行
     * @throws Exception
     */
    public static int executePageTask(int taskId) throws Exception {
        RemoteShellExecutor executor = new RemoteShellExecutor(
                "192.168.43.111", "root", "root");
        String command =
                "/home/produce_env/taskjar/page_convert.sh "
                        + taskId;
        return executor.exec(command);
    }

    /**
     * 远程主机执行热门商品统计任务
     * @param taskId 任务id
     * @return 状态码：0 成功执行
     * @throws Exception
     */
    public static int executeProductTask(int taskId) throws Exception {
        RemoteShellExecutor executor = new RemoteShellExecutor(
                "192.168.43.111", "root", "root");
        String command =
                "/home/produce_env/taskjar/area_product.sh "
                        + taskId;
        return executor.exec(command);
    }
}
