package com.fast.apparchticture.data.data_source.remote

import retrofit2.http.GET

interface ItemsWebService {
    @GET("activity")
    suspend fun getItems():ResponseDto
}