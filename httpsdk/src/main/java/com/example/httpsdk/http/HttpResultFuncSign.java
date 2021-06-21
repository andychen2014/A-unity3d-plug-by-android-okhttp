package com.example.httpsdk.http;

import rx.functions.Func1;

public class HttpResultFuncSign  <T> implements Func1<HttpResultSign<T>, T> {
    @Override
    public T call(HttpResultSign<T> httpResultSign) {
//        if (httpResultSign.getStatus() != 0) {
//            throw new ApiException(httpResultSign.getMsg());
//        }
        if(httpResultSign.getStatus()==200)
        {
            return (T) "Success";
        }

        return (T)null;
    }
}
