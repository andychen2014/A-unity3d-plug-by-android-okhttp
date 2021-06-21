package com.example.httpsdk.http;

public class HttpResultSign <T>{
    private int status;
    private T data;
    private String msg;


    public String getMsg() {   return msg; }
    public void setMsg(String msg) {   this.msg = msg;}
    public int getStatus() {
        return status;
    }

    public void setStatus(int code) {
        this.status = code;
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
