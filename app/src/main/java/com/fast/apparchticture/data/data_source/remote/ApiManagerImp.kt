package com.fast.apparchticture.data.data_source.remote

import com.fast.apparchticture.core.Constants
import com.fast.apparchticture.domain.data_source.ApiManager
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

class ApiManagerImp @Inject constructor():ApiManager {
    private val retrofit=Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    override fun <T> buildWebService(webService:Class<T>):T{
        return retrofit.create(webService)
    }
}