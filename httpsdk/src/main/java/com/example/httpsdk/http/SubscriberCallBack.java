package com.example.httpsdk.http;

import android.util.Log;

import java.net.ConnectException;
import java.net.SocketTimeoutException;

import rx.Subscriber;

public class SubscriberCallBack extends Subscriber {

    private ApiCallback apiCallback;

    public SubscriberCallBack(ApiCallback apiCallback){
        this.apiCallback = apiCallback;
    }

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        String msg;
        if (e instanceof SocketTimeoutException) {
            msg = "网络中断，请检查您的网络状态";
            apiCallback.onFailure(msg);
        } else if (e instanceof ConnectException) {
            msg = "网络中断，请检查您的网络状态";
            apiCallback.onFailure(msg);
        } else {
            Log.e("json","发送错误",e);
            apiCallback.onFailure(e.getMessage());
        }
    }

    @Override
    public void onNext(Object t) {
        try {
            apiCallback.onSuccess(t);
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
