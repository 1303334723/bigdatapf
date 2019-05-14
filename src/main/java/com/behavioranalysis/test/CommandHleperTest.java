package com.behavioranalysis.test;

import com.behavioranalysis.util.CommandHelper;
import com.behavioranalysis.util.CommandResult;

import java.io.IOException;

public class CommandHleperTest {
    public static void main(String[] args) {
        String shpath = "";
        String param = "";
        String commandStr = "/bin/sh " + shpath + param;
        try {
            CommandResult result = CommandHelper.exec(commandStr);
            if (result != null) {
                System.out.println("Output : " + result.getOutput());
                System.out.println("Error : " + result.getError());
            }
        } catch (IOException e) {
            System.out.println("IOException : " + e.getLocalizedMessage());
        } catch (InterruptedException e) {
            System.out.println("InterruptedExceptioin : " + e.getLocalizedMessage());
        }
    }
}
