package com.ls.sbmdemo.common;

import java.io.Serializable;

/**
 * 返回的数据
 */

public class ServerResponse<T> implements Serializable {
    private int status;//返回的状态
    private String msg;//返回的消息
    private T data;//返回的数据

    public ServerResponse() {
    }

    public ServerResponse(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
