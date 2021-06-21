package com.example.httpsdk.http;

import rx.functions.Func1;

public class HttpResultFunc <T> implements Func1<HttpResult<T>, T> {
    private final String TAG = "HttpResultFunc";
    @Override
    public T call(HttpResult<T> httpResult) {

        if (httpResult.getCode() != 0) {
            throw new ApiException(httpResult.getMsg());
        }
        if(httpResult.getData()!=null)
        {
            return httpResult.getData();
        }else if(httpResult.getMsg()!=null){
            return (T)httpResult.getMsg();
        }else if(httpResult.getStatus()!=0)
        {
            return (T) String.valueOf(httpResult.getStatus());
        }
        return (T)null;
    }
}
