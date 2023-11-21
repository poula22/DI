package com.fast.apparchticture.data.data_source.remote

import com.fast.apparchticture.domain.data_source.ApiManager
import com.fast.apparchticture.domain.data_source.RemoteDataSource
import javax.inject.Inject

class RemoteDataSourceImp @Inject constructor(apiManager: ApiManager):RemoteDataSource {
    private val webService=apiManager.buildWebService(ItemsWebService::class.java)

    override suspend fun fetchData(): String {
        return webService.getItems().toString()
    }
}