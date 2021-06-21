package com.example.httpsdk.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;



public class SystemUtil {

    /*
    检查WIFI是否连接
     */
    public static boolean isWifiConnected(Context context){
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo wifiInfo = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        return wifiInfo !=null;
    }

    /*
    判断WIFI是否打开
     */
    public static boolean isWiFi(Context context){
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if(networkInfo != null && networkInfo.getType()== ConnectivityManager.TYPE_WIFI){
            return true;
        }
        return false;
    }

    /*
    判断网络是否连接
     */
    public static boolean isNetworkAvailable(Context context){
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if(connectivityManager == null){

        }else{
            NetworkInfo[] networkInfos = connectivityManager.getAllNetworkInfo();
            if(networkInfos != null && networkInfos.length>0){
                for (int i = 0;i<networkInfos.length;i++){
                    if(networkInfos[i].getState() == NetworkInfo.State.CONNECTED){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /*
    检查手机网络(4g/3G/2G)是否连接
     */
    public static boolean isMobileNetworkConnected(Context context){
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo mobileNetworkInfo = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        return mobileNetworkInfo != null;
    }

    /*
    检查是否有可用网络
     */
    public static boolean isNetworkConnected(Context context){
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        return connectivityManager.getActiveNetworkInfo() != null;
    }

/*
保存文字到剪贴板
 */
public static void copyToClipBoard(Context context, String text){
    ClipData clipData = ClipData.newPlainText("url",text);
    ClipboardManager manager =(ClipboardManager)context.getSystemService(Context.CLIPBOARD_SERVICE);
    manager.setPrimaryClip(clipData);
//    ToastUtil.shortShow("已复制到剪贴板");
}


}
