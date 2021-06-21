package com.example.httpsdk.http;

public interface ApiCallback  <T> {

    void onSuccess(T model);

    void onFailure(String msg);
}