package com.example.httpsdk.utils;

import android.os.Environment;

import java.io.File;

public class Constants {

    /*
    文件路径
     */
//    public static final String PATH_DATA = App.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";

    public static final String PATH_DATA = Environment.getDownloadCacheDirectory().getAbsolutePath()+ File.separator+"data";

    public static final String path = Environment
            .getExternalStorageDirectory() + "/JH/log/";

    public static final String headImage = Environment.getExternalStorageDirectory()+"/JH/img/";

    //    http://52.176.152.91:8081/bracelet/team/teams?token=CIAx6nSYe7D0Lp1wWaNB%2BQ%3D%3D

    public static String BASE_URL = "http://116.30.222.13:8081/";
    public static String JOIN_TEAM = "/bracelet/team/invite/agree/";
    public static String GET_TEAM = "/bracelet/team/teams/";
    public static String EXIT_TEAM = "/bracelet/team/exit/team/";
    public static String HEAD_IMAGE = "/bracelet/login/upload/user/head/img";
    public static String HEAD_IMAGE_URL = "/bracelet/login/user/head/image/download/";

    public static final String ADD_WARN_DATA =  "/bracelet/actionData/add/warn/data";
    public static final String ADD_ACTION_DATA =  "/bracelet/actionData/add/action/data";
    public static final String ADD_SYMPTOMS_DATA=  "/bracelet/actionData/add/symptoms/data";


    public static int Male = 0;
    public static int Female = 1;
    public static String[] mMonth = new String[]{"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public static String[] mSex = {"Male", "Female"};
    /*
    保存在手机里的sp文件名
     */

    public static final String FILE_NAME = "kenzen_sp";
    public static final String FILE_NAME2 = "list_sp";

    /*
    常量
     */
    public static final String TOKEN = "token";
    public static final String USERID = "id";
    public static final String TEAMID = "team_id";
    public static final String LOGIN_BIRTH_MONTH = "birth_month";
    public static final String LOGIN_HEIGHT = "height";
    public static final String LOGIN_WEIGHT= "weight";
    public static final String LOGIN_HEADER_IMAGE = "login_header_image";
    public static final String LOGIN_FIRST_NAME="first_name";
    public static final String LOGIN_LAST_NAME="last_name";
    public static final String LOGIN_SEX = "sex";


    public static final String HEAD_IMAGE_NAME = "head_image_name";


    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";
    public static final String EMAIL = "email";
    public static final String FIRSTNAME = "first_name";
    public static final String LASTNAME = "last_name";
    public static final String ANONY = "anony";
    public static final String SEX = "sex";

    public static final String ADDRESS = "address";
    public static final String BIRTHYEAR = "birth_year";
    public static final String BIRTHMONTH = "birth_month";
    public static final String BIRTHDAY = "birth_day";
    public static final String BIRTH = "birth";
    public static final String HEIGHT = "height";
    public static final String HEIGHTUNIT = "height_unit";
    public static final String WEIGHT = "weight";
    public static final String WEGHTUNIT = "weight_unit";
    public static final String MEASUREMENT = "measurement";
    public static final String COUNTRY = "country";

    public static final String EMAILCODE = "email_code";

    public static final String NEWFLAGS = "new_flags";
    public static final String NEWFLAGS_TIME = "new_flags_time";


    public static final String USER = "";

    public static boolean uploadLog = false;

    public static final int REQUEST_PERMISSION = 100;

    public static final int TYPE_SHEET_BODY = 1;

    //////////////////////////////////////////setting界面//////////////////////////////////////////////////
    public static final String SETTING_MEASUREMENTS = "setting_measurements";
    public static final String SETTING_NOTIFY = "setting_notify";
    public static final String SETTING_PATH_VIBRATE= "setting_path_vibrate";
    public static final String SETTING_PHONE_AUDIO= "setting_phone_audio";
    public static final String SETTING_LOCATION_FOR_WEATHER= "setting_LOCATION_FOR_WEATHER";


    //////////////////////////////////////////alert//////////////////////////////////////////////////////////
    public static final String WARN_ID = "warn_id";
    public static final int SYMPTOMS = 1;

    /*
    文件路径
     */
//    public static final String PATH_DATA = App.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";

    public static final String PATH_IMAGE =  Environment.getExternalStorageDirectory() + "/kenzen/header.jpg";
    public static final String PATH_FIRMWARE = Environment.getExternalStorageDirectory()+"/kenzen/";
    public static final String FIRMWARE_NAME = "Firmware.zip";


    /*****************************************************************************************************************************************************/


    public static boolean isUploadLog() {
        return uploadLog;
    }

    public static void setUploadLog(boolean uploadLog) {
        Constants.uploadLog = uploadLog;
    }


    //////////////////////////////////蓝牙///////////////////////////////////////////////
    /**
     * 下拉刷新列表的各个状态
     */
    public static final int LIST = 0;
    public static final int EMPTY = 1;
    public static final int ERROR = 2;
    public static final int LOADING = 3;
    public static final int ALLOW_PULL_IN_EMPTY_PAGE = 4; // 没有内容，但是允许下拉刷新
    public static final int REQUEST_CODE_OPEN_GPS = 1;
    public static final int REQUEST_CODE_PERMISSION_LOCATION = 2;



    public static final int DEVICE_DISCONNECT = 0;
    public static final int DEVICE_CONNECT = 1;
    public static final int DEVICE_NEXT = 2;
    public static final int DEVICE_CONNECTED = 3;
    public static final int DEVICE_WRITE_DATA = 4;
    public static final int DEVICE_RESET_FACTORY = 5;
    public static final int JUMP_SETTING = 6;
    public static final String DEVICE_ADDRESS = "device_address";
    public static final String DEVICE_NAME = "device_name";
    public static final String DEVICE_STATUS = "device_status";
    public static final String MANUAL_DISCONNECT = "manual_disconnect";
    public static final int RECONNECT_DELAY = 1000*10;  //10秒

    /*jump */
    public static final  String JUMP_TYPE = "jump_type";
    public static final  String JUMP_COUNT = "jump_count";
    public static final  String JUMP_START_TIME = "jump_start_time";
    public static final  String JUMP_END_TIME = "jump_end_time";

    public static final int JUMP_TYPE_UNSETTING = 0;
    public static final int JUMP_TYPE_TIMER = 1;
    public static final int JUMP_TYPE_COUNT = 2;
    public static final int JUMP_TYPE_FREE = 3;






    public static final String CONNECT = "connect";
    public static final String WRITE ="write";
    public static final String DATA ="data";

    public static final String FIRMWARE_VERSION = "firmware_version";
    public static final String DEVICE_HISTORY ="device_history";
    public static final String CALIBRATION_VALUE = "calibration_value";

    public static final int JOINTEAMCODE = 12345;

    public static final int TYPE_BLACK = 1;
    public static final int TYPE_WHITE= 2;


    public static final String MY_PROFILE_HEIGHT_UNIT="HEIGHT_UNIT";
    public static final String MY_PROFILE_WEIGHT_UNIT="WEIGHT_UNIT";
    public static final String MY_PROFILE_HEIGHT_VALUE="HEIGHT_VALUE";
    public static final String MY_PROFILE_WEIGHT_VALUE="WEIGHT_VALUE";


    public static final String MY_PROFILE_HEIGHT_VALUE_SAVE="HEIGHT_VALUE_SAVE";
    public static final String MY_PROFILE_WEIGHT_VALUE_SAVE="WEIGHT_VALUE_SAVE";


    public static final String UPLOAD_LAST_DAY = "upload_last_day";





}
