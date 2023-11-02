package com.fast.apparchticture.domain.data_source

interface RemoteDataSource {
    suspend fun fetchData():String
}