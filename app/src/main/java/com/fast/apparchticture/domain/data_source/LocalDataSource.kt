package com.fast.apparchticture.domain.data_source

interface LocalDataSource {
    suspend fun fetchData():String
}