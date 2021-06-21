package com.example.httpsdk.main;

import android.content.Context;
import android.util.Log;

import com.example.httpsdk.api.ApiServer;
import com.example.httpsdk.base.RxPresenter;
import com.example.httpsdk.bean.JumpBean;
import com.example.httpsdk.http.ApiCallback;
import com.example.httpsdk.http.HttpMethods;
import com.example.httpsdk.http.SubscriberCallBack;
import com.google.gson.Gson;

import org.json.JSONObject;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class MainPresenter extends RxPresenter<MainContract.View> implements  MainContract.Presenter{
    private static final String TAG = "MainPresenter";
    private ApiServer apiServer;
    private Context mContext;
    public MainPresenter(Context context)
    {
        mContext = context;
        apiServer = HttpMethods.getInstance(mContext).create(ApiServer.class);

        Log.d("ok","ok");

    }

    @Override
    public  void login(String name,String pwd)
    {
        getToken(name);
    }

    @Override
    public void getToken(String name) {
        apiServer.getToken(name)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .map(new Func1<ResponseBody, String>() {
                    @Override
                    public String call(ResponseBody responseBody) {
                        String data = "";
                        try{
                            data = responseBody.string();
                        }catch (Exception e)
                        {
                            e.printStackTrace();
                        }
                        return data;
                    }
                }).subscribe(new SubscriberCallBack(new ApiCallback<String>() {

            @Override
            public void onSuccess(String model) {
                mView.getTokenSuccess(model);
            }

            @Override
            public void onFailure(String msg) {
                mView.getTokenFailed(msg);
            }
        }));
    }


    public void pushData(JumpBean bean)
    {
        Gson gson = new Gson();
        String jsonData = gson.toJson(bean);
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json; Accept: application/json"),jsonData);
        apiServer.pushData(requestBody)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .map(new Func1<ResponseBody, String>() {
                    @Override
                    public String call(ResponseBody responseBody) {
                        String data = "";
                        try {
                            data = responseBody.string();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        return data;
                    }
                }).subscribe(new SubscriberCallBack(new ApiCallback<String>() {
            @Override
            public void onSuccess(String model) {
                Log.d("fsadfa","fasdfa");
                String msg = "";
                try {
                    JSONObject jsonObject = new JSONObject(model);
                    msg =jsonObject.getString("data");
                }catch (Exception e)
                {
                    e.printStackTrace();
                    mView.pushDataSuccess("返回数据解释异常");
                }
                mView.pushDataSuccess(msg);
            }

            @Override
            public void onFailure(String msg) {
                Log.d("fsadfa","fasdfa");
                mView.pushDataFailed("数据上传失败");
            }
        }));
    }
}
