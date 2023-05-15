package com.example.hkbptarutung.app

object Utils {

    val BASE_URL_API = "http://192.168.43.234:8080/api/auth/"

    // Mendeklarasikan Interface BaseApiService
    fun getAPIService(): ApiService {
        return RetrofitClient.getClient(BASE_URL_API)!!.create(ApiService::class.java)
    }
}