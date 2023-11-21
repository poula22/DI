package com.fast.apparchticture.data.data_source.local

import com.fast.apparchticture.domain.data_source.LocalDataSource
import javax.inject.Inject

class LocalDataSourceImp @Inject constructor(private val localDatabase: LocalDatabase):LocalDataSource {
    override suspend fun fetchData(): String {
        return localDatabase.loadData()
    }
}