package com.example.httpsdk.http;

public class HttpResult <T> {
    private int code;
    private T data;
    private String msg;
    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {   return msg; }
    public void setMsg(String msg) {   this.msg = msg;}
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        if(null!=data){
            sb.append(data.toString());
        }
        return sb.toString();
    }
}
