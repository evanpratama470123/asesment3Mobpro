package com.evanpratama0137.digiperpus.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "http://103.150.101.124:3006/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface PerpustakaanApiService
{
 @GET("perpustakaans/")
 suspend fun getPerpustakaan(): String
}

object  PerpustakaanApi {
    val service: PerpustakaanApiService by lazy {
        retrofit.create(PerpustakaanApiService::class.java)
    }
}