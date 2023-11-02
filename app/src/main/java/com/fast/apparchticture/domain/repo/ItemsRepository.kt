package com.fast.apparchticture.domain.repo

interface ItemsRepository {
    suspend fun fetchData():String
}