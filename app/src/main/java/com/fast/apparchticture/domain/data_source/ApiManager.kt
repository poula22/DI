package com.fast.apparchticture.domain.data_source

import com.fast.apparchticture.data.data_source.remote.ItemsWebService

interface ApiManager {
    fun <T> buildWebService(webService:Class<T>): T
}