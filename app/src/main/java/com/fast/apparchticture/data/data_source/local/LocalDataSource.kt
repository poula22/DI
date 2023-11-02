package com.fast.apparchticture.data.data_source.local

import com.fast.apparchticture.domain.data_source.LocalDataSource

class LocalDataSourceImp:LocalDataSource {
    override suspend fun fetchData(): String {
        return ""
    }
}