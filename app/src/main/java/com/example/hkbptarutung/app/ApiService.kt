package com.example.hkbptarutung.app

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {
    @FormUrlEncoded
   @POST("signup")
   fun Lanjut(
       @Field("name") name:String,
       @Field("email") email:String,
       @Field("password") password:String
   ): Call<ResponseBody>
   @FormUrlEncoded
    @POST("login")
    fun Login(
        @Field("name") name:String,
        @Field("email") email:String,
        @Field("password") password:String
    ): Call<ResponseBody>
}