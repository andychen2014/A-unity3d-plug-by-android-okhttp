package com.example.httpsdk.api;

import com.example.httpsdk.http.HttpResult;

import java.util.Map;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;
import retrofit2.http.Url;
import rx.Observable;

public interface ApiServer {
    /*
用户接受邀请
*/
    @GET
    Observable<ResponseBody> teamInviteAgree(@Url String url);

    /*
   用户登陆
    */
    @FormUrlEncoded
    @POST("/bracelet/login/phone")
    Observable<ResponseBody> newLogin2(@Field("email") String email, @Field("password") String password);


    /*
        登录
     */
    @FormUrlEncoded
    @POST("user/login")
    Observable<ResponseBody>Login(@Field("username")String username,@Field("pwd")String pwd);


    /*
       获取 token
     */

    /*/
    注册
     */

    @FormUrlEncoded
    @POST("/user/getToken")
    Observable<ResponseBody>getToken(@Field("username")String username);

    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST("/pushData")
    Observable<ResponseBody>pushData(@Body RequestBody body);


    /*
获取 验证码
 */
    @FormUrlEncoded
    @POST("bracelet/login/send/email/check")
    Observable<HttpResult<String>> getCode(@Field("email") String email);

//    email	是	string	邮箱
//    first_name	是	string	姓
//    last_name	是	string	名
//    anoymize	是	int	是否匿名 0否 1是
//    sex	是	int	性别
//    address	是	string	地址
//    birth_year	否	int	年
//    birth_month	否	int	月
//    birth_day	否	int	日
//    height	否	string	身高
//    height_unit	否	string	单位
//    weight	否	string	体重
//    weight_unit	否	string	单位
//    measurement	否	string
//    country	否	string	国家

    //    email, password, first_name, last_name, sex, birth, height, height_unit, weight, weight_unit, measurement, country, anoymize
    @FormUrlEncoded
    @POST("/bracelet/login/register")
    Observable<ResponseBody> newSinUp(
            @Field("email") String email
            , @Field("password") String password
            , @Field("first_name") String firstname
            , @Field("last_name") String lastname
            , @Field("sex") int sex
            , @Field("birth") String birth
            , @Field("height") String height
            , @Field("height_unit") String height_unit
            , @Field("weight") String weight
            , @Field("weight_unit") String weight_unit
            , @Field("measurement") String measurement
            , @Field("country") String country
            , @Field("anoymize") int anoymize);





    /*
  修改密码时获取验证码
   */
    @FormUrlEncoded
    @POST("/bracelet/login/forget/password/send/email")
    Observable<ResponseBody> newForgePwdGetCode(@Field("email") String email);


    /*
    修改密码
     */
    @FormUrlEncoded
    @POST("/bracelet/login/change/password")
    Observable<HttpResult<String>> changePWD(@Field("password") String password, @Field("newpassword") String newpassword);

    /*
    忘记密码
     */
    @FormUrlEncoded
    @POST("bracelet/forget/password/send/email")
    Observable<HttpResult<String>> forgetPWD(@Field("email") String email);


    /*
    重置密码
 */
    @FormUrlEncoded
    @POST("/bracelet/login/reset/password")
    Observable<HttpResult<String>> resetPWD(@Field("code") String code, @Field("email") String email, @Field("password") String password);

    @FormUrlEncoded
    @POST("/bracelet/login/reset/password")
    Observable<ResponseBody> newResetPWD(@Field("code") String code, @Field("email") String email, @Field("password") String password);

    //获取用户信息
    @FormUrlEncoded
    @POST("/bracelet/login/user/info")
    Observable<ResponseBody> newGetUserInfo(@Field("token") String token);

    //修改用户信息
    @FormUrlEncoded
    @POST("/bracelet/login/update/user_info")
    Observable<ResponseBody> newUploadUserInfo(@Field("token") String token
            , @Field("first_name") String first_name
            , @Field("last_name") String last_name
            , @Field("sex") int sex
            , @Field("birth") String birth
            , @Field("height") String height
            , @Field("height_unit") String height_unit
            , @Field("weight") String weight
            , @Field("weight_unit") String weight_unit
            , @Field("country") String country
            , @Field("user_head_img_name") String head_image
            , @Field("time_zone") String time_zone);



    //修改用户头像
    @FormUrlEncoded
    @POST("/bracelet/login/user/head/image/address")
    Observable<ResponseBody> newGetUserHeaderImage(@Field("token") String token);

    //下载用户头像
    @FormUrlEncoded
    @POST("/bracelet/login/user/head/image/download")
    Observable<ResponseBody> newDownloadUserHeaderImage(@Field("name") String name);

    //上传用户头像
    @Multipart
    @POST()
    Observable<ResponseBody> newUploadUserHeaderImage(@Url String url, @PartMap() Map<String, RequestBody> imgs);

    /*
    警告数据添加
*/
    @FormUrlEncoded
    @POST("bracelet/actionData/add/warn/data")
    Observable<ResponseBody> warnAddData(@Field("token") String token, @Field("user_id") long userId, @Field("team_id") long teamId, @Field("warn_num") String warnNum, @Field("type") int type);


    /*
    警告后处理动作数据添加
*/
    @FormUrlEncoded
    @POST("bracelet/actionData/add/action/data")
    Observable<ResponseBody> warnAddActionData(@Field("token") String token, @Field("warn_id") long warnId, @Field("type") int type);

/*
警告后状态选择数据添加
 */

    @FormUrlEncoded
    @POST("bracelet/actionData/add/symptoms/data")
    Observable<ResponseBody> warnAddSymptomsData(@Field("token") String token, @Field("action_id") long actionId, @Field("type") int type);

//    /*
//    获取用户信息
//     */
//    @FormUrlEncoded
//    @POST("bracelet/login/user/info")
//    Observable<HttpResult<UserInfoBean>> getUserInfo();


    /*
    获取用户头像name
     */
    @FormUrlEncoded
    @POST("bracelet/login/user/head/image/address")
    Observable<HttpResult<String>> getUserHeadImage();

    /*
    用户头像下载
     */
    @FormUrlEncoded
    @POST("bracelet/login/user/head/image/download")
    Observable<HttpResult<String>> getUserHeadImageDownlaod(@Field("name") String string);

    /*
    用户头像上传
     */
    @FormUrlEncoded
    @POST("bracelet/login/upload/user/head/img")
    Observable<HttpResult<String>> getUserHeadImageUplaod();


    /**************************************组*************************************/

//    bracelet/team/invite/agree/{invitecode}


    /*用户退出team*/
    @FormUrlEncoded
    @POST
    Observable<ResponseBody> teamExit(@Url String teamId, @Field("token") String token);

    /*获取用户team设置*/
    @FormUrlEncoded
    @POST("bracelet/team/user/setting/info/get")
    Observable<ResponseBody> teamGetUserSetting(@Field("token") String token, @Field("team_id") long teamId);

    /*获取用户所属team列表*/

    @GET
    Observable<ResponseBody> teamGetTeams(@Url String url);


    /*修改用户team设置*/
    @FormUrlEncoded
    @POST("bracelet/team/user/setting/info/update")
    Observable<ResponseBody> teamChangeTeamSetting(@Field("token") String token, @Field("team_id") long teamId, @Field("job") String job, @Field("employee_id") String employeeId, @Field("type") int type);


    /*
    保存用户team设置
     */
    @FormUrlEncoded
    @POST("bracelet/team/user/setting/info/save")
    Observable<ResponseBody> teamSaveSetting(@Field("token") String token, @Field("team_id") long teamId, @Field("job") String job, @Field("employee_id") String employeeId, @Field("type") int type);


}