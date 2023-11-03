package com.fast.apparchticture.data.repo

import com.fast.apparchticture.data.data_source.local.LocalDataSourceImp
import com.fast.apparchticture.data.data_source.remote.RemoteDataSourceImp
import com.fast.apparchticture.domain.data_source.LocalDataSource
import com.fast.apparchticture.domain.data_source.RemoteDataSource
import com.fast.apparchticture.domain.repo.ItemsRepository

class ItemsRepositoryImp(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
):ItemsRepository {
    override suspend fun fetchData(): String {
        return remoteDataSource.fetchData()
    }
}