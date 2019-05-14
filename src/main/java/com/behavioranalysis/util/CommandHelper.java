package com.behavioranalysis.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * shell脚本执行程序
 */
public class CommandHelper {
    // default time out, in millseconds
    public static final int DEFAULT_INTERVAL = 1000;

    public static CommandResult exec(String command) throws IOException,  InterruptedException {
        Process process = Runtime.getRuntime().exec(command);
        CommandResult commandResult = wait(process);
        if (process != null)
        {
            process.destroy();
        }
        return commandResult;
    }

    private static CommandResult wait(Process process) throws InterruptedException, IOException {
        BufferedReader errorStreamReader = null;
        BufferedReader inputStreamReader = null;
        try {
            errorStreamReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            inputStreamReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            CommandResult result = new CommandResult();
            result.setExitValue(process.waitFor());
            // parse error info
            if (errorStreamReader.ready()) {
                StringBuilder builder = new StringBuilder();
                String line;
                while ((line = errorStreamReader.readLine()) != null) {
                    builder.append(line);
                }
                result.setError(builder.toString());
            }
            // parse info
            if (inputStreamReader.ready()) {
                StringBuilder builder = new StringBuilder();
                String line;
                while ((line = inputStreamReader.readLine()) != null) {
                    builder.append(line);
                }
                result.setOutput(builder.toString());
            }
            return result;
        } finally {
            if (errorStreamReader != null) {
                try {
                    errorStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
