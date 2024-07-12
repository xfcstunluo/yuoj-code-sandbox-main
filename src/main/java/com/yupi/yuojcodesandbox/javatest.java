package com.yupi.yuojcodesandbox;

import org.assertj.core.util.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class javatest {
    public static void main(String[] args) {
        try {
            // 使用 ProcessBuilder 执行 java -version 命令
            ProcessBuilder processBuilder = new ProcessBuilder("java", "-version");
            Process process = processBuilder.start();

            // 读取命令执行结果
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }