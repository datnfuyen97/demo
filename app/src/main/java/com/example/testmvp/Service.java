package com.example.testmvp;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Service {
    @FormUrlEncoded
  @POST("logincheck")
    Call<ResponseBody> userlogin(@Field("username") String username, @Field("password") String password);
}

