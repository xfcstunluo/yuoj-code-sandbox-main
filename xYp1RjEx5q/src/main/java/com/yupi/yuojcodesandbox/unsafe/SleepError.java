package com.yupi.yuojcodesandbox.unsafe;

/**
 * 无限睡眠（阻塞程序执行）
 */
public class SleepError {
    public static void main(String[] args) throws InterruptedException {
        long ONE_HOUR=60*60*1000L;
        Thread.sleep(ONE_HOUR);
        System.out.println("三点睡五点起，阎王夸我好身体");

    }
}
