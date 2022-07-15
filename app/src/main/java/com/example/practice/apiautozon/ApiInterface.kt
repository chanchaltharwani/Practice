package com.example.practice.apiautozon

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
interface ApiInterface {
    @FormUrlEncoded
    @POST("api/user/login")//value = end url
    fun login(
        @Field("username") username: String,
        @Field("password") password: String,
        @Field("device") device: String = "android"
    ): Call<AutoLoginResponseModel>
    @FormUrlEncoded
    @POST("api/user/signup")//value = end url
    fun signup(
        @Field("p_user_name") p_user_name: String,
        @Field("p_user_email") p_user_email: String,
        @Field("p_user_password") p_user_password: String ,
        @Field("device") device: String = "android"
    ): Call<AutoSignopResponseModel>

}