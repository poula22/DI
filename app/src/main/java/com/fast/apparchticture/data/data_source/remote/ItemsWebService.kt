package com.fast.apparchticture.data.data_source.remote

interface ItemsWebService {
    suspend fun getItems():String
}