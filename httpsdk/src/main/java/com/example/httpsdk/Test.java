package com.example.httpsdk;

import android.content.Context;
import android.util.Log;

import com.example.httpsdk.main.MainContract;
import com.example.httpsdk.main.MainPresenter;

public class Test implements MainContract.View {
    private final String tag = "TestClass";

    private Context mContext;
    private MainPresenter mainPresenter;


    public Test(Context context)
    {
        Log.d(tag,"init mainPresenter Test");
        Log.d(tag,"init mainPresenter Test");


        mContext = context;
        mainPresenter = new MainPresenter(mContext);
        if(mainPresenter!=null)
        {
            Log.d(tag,"init mainPresenter");
            Log.d(tag,"init mainPresenter");

            mainPresenter.attachView(this);
        }else{
            Log.d(tag,"init mainPresenter null");
        }
    }


    public void onDestroy()
    {
        if(mainPresenter!=null)
        {
            mainPresenter.detachView();
        }
    }

    public void  Login(String name,String pwd)
    {
        Log.d(tag,"init Login start");
        mainPresenter.getToken(name);
        Log.d(tag,"init Login end");
    }


    @Override
    public void getTokenSuccess(String msg) {
        Log.d(tag,"get Token is ok");
        if(onSetListener!=null)
        {
            onSetListener.OnMessage(msg,"String");
        }

    }

    @Override
    public void getTokenFailed(String msg) {
        if(onSetListener!=null)
        {
            onSetListener.OnMessage(msg,"String");
        }
    }

    @Override
    public void pushDataSuccess(String msg) {

    }

    @Override
    public void pushDataFailed(String msg) {

    }

    @Override
    public void showError(String msg) {

    }

    @Override
    public void showError() {

    }


    public TestListener onSetListener;

    public void setOnSetListener(TestListener _onSetListener){
        onSetListener = _onSetListener;
    }

}
