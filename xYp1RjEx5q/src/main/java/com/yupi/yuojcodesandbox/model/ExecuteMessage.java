package com.yupi.yuojcodesandbox.model;

import lombok.Data;

/**
 * 用来封装进制执行后返回的信息，因为返回的信息有执行成功的，有执行错误的报错信
 * 息，单纯的返回无法覆盖这几种信息，所以需要建立一个对象
 */
@Data
public class ExecuteMessage {
    private Integer exitValue;
    private String message;
    private String errorMessage;
    private Long time;
}
