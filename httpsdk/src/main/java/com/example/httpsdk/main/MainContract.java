package com.example.httpsdk.main;

import com.example.httpsdk.base.BasePresenter;
import com.example.httpsdk.base.BaseView;

public interface MainContract {
    interface View extends BaseView {
        void getTokenSuccess(String msg);
        void getTokenFailed(String msg);

        void pushDataSuccess(String msg);
        void pushDataFailed(String msg);
    }

    interface  Presenter extends BasePresenter<View> {
        void getToken(String name);
        void login(String name,String pwd);
    }
}
