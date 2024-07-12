package com.yupi.yuojcodesandbox;

import com.yupi.yuojcodesandbox.model.ExecuteMessage;
import com.yupi.yuojcodesandbox.utils.ProcessUtils;

import java.io.IOException;

public class javatest {
    public static void main(String[] args) throws IOException {
        String compileCmd="java -version\n";
        Process compileProcess = Runtime.getRuntime().exec(compileCmd);
        ExecuteMessage executeMessage = ProcessUtils.runProcessAndGetMessage(compileProcess, "编译");
        System.out.println(executeMessage);

    }
}