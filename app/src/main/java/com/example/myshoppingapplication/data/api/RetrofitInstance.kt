package com.example.myshoppingapplication.data.api

import okhttp3.OkHttp
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {

    private val loggingInterceptor = HttpLoggingInterceptor().apply{
        level = HttpLoggingInterceptor.Level.BODY

    }

    private val converter = GsonConverterFactory.create()
    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor).build()

    private val retrofit = Retrofit.Builder()
        .baseUrl(ApiDetail.BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(converter).build()

    private val retrofit2 = Retrofit.Builder()
        .baseUrl(ApiDetail.BASE_URL_SHOPPING)
        .client(okHttpClient)
        .addConverterFactory(converter).build()

    //Create reference to our local API endpoints
    val apiClient = retrofit.create(ApiEndpoints::class.java)
    val apiClient2 = retrofit2.create(ApiEndpoints::class.java)


















}