package com.example.sonata.takeattendancev2.Interface;

import com.example.sonata.takeattendancev2.LogIn.LoginClass;
import com.example.sonata.takeattendancev2.SignUp.SignupClass;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Sonata on 6/1/2016.
 */
public interface StringClient {
    @GET("api/home")
    Call<String> getString();

    //    @Headers("Authorization: Bearer WBMXHk5V0LDwQKJ0fasM2KZZ6KySx3f1")
    @GET("user/logout")
    Call<ResponseBody> logout();

    @GET("api/check-student")
    Call<ResponseBody> checkStudent();

    @POST("api/post")
    Call<String> postString(@Body String MothaibaBook);

    @POST("user/login")
    Call<ResponseBody> login(@Body LoginClass up);

    @POST("user/signup")
    Call<ResponseBody> signup(@Body SignupClass user);


//    @POST("/attendance-system/api/web/index.php/v1/api/post")
//    Call<JSONObject> postJSON(@Body JSONObject MothaibaBook);

//    @POST("/attendance-system/api/web/index.php/v1/api/post")
//    Call<String> postJSONreceiveString(@Body JSONObject up);
}
