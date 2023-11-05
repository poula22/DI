package com.fast.apparchticture.data.data_source.local

import com.fast.apparchticture.data.data_source.local.dao.ItemsDao
import com.fast.apparchticture.domain.data_source.LocalDataSource

class LocalDataSourceImp(itemsDao: ItemsDao):LocalDataSource {
    override suspend fun fetchData(): String {
        return ""
    }
}