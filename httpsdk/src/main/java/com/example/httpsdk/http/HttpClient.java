package com.example.httpsdk.http;

import com.example.httpsdk.utils.Constants;

import java.util.concurrent.TimeUnit;

import okhttp3.Authenticator;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;

public final class HttpClient {
    private static Retrofit retrofit;
    private static final int DEFAULT_TIMEOUT = 10*3;
    private HttpClient(){

    }
    public static Retrofit getInstance(){
        if(retrofit == null){
            OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder()
                    .authenticator((Authenticator.NONE))
                    .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);

            retrofit = new Retrofit.Builder()
                    .client(okHttpClient.build())
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(DecodeConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
        }
        return retrofit;
    }

}